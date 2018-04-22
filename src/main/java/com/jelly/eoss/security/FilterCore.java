package com.jelly.eoss.security;

import com.google.common.io.LineReader;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.StringReader;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by jelly on 2016-10-26.
 */
public class FilterCore {
    private static final Logger log = LoggerFactory.getLogger(FilterCore.class);

    PatternMatcher patternMatcher = new AntPathMatcher();
    List<FilterRule> filterRuleList = null;
    private String loginUrl;

    public void init(String config, String lines){
        initMain(config);
        filterRuleList = FilterRuleFactory.initRuleByFilterDefinition(lines);
    }

    private void initMain(String config){
        if(StringUtils.isEmpty(config)){
            return;
        }

        LineReader lineReader = null;
        try {
            lineReader = new LineReader(new StringReader(config));
            String line = null;
            while((line = lineReader.readLine()) != null){
                line = StringUtils.trimToNull(line);
                if(line == null){
                    continue;
                }

                if(StringUtils.startsWith(line, "#")){
                    continue;
                }

                String[] nameValue = StringUtils.split(line, FilterRuleFactory.EQUAL);
                if(nameValue == null || nameValue.length == 1){
                    continue;
                }
                String name = StringUtils.trimToEmpty(nameValue[0]);
                String value = StringUtils.trimToEmpty(nameValue[1]);

                switch (name){
                    case "loginUrl":{
                        this.loginUrl = value;
                        log.debug("loginUrl={}", loginUrl);
                        break;
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean doFilter(String path, boolean authc, Collection<String> rolesOfUser, Collection<String> permsOfUser){
        if(filterRuleList == null || filterRuleList.size() == 0){
            return true;
        }

        boolean matchPass = false;
        log.debug("------start do filter path={}------", path);
        path = StringUtils.lowerCase(path);
        for(FilterRule filterRule : filterRuleList){
            if(patternMatcher.matches(filterRule.getPattern(), path)){
                if(filterRule.getAnno()){//无任何规则
                    matchPass = true;
                }else if(filterRule.getAuthc() && !authc){//必须登录，也就是经过了(认证)
                    matchPass = false;
                }else {//必须登录，且有相关的(授权)
                    boolean userHasRole = filterRule.userHasRole(rolesOfUser);
                    boolean userHasPerm = filterRule.userHasPerm(permsOfUser);

                    if(filterRule.getRoleSet().size() > 0 && filterRule.getPermSet().size() > 0){
                        if(userHasRole || userHasPerm) matchPass = true;
                    }else if(filterRule.getRoleSet().size() > 0 && filterRule.getPermSet().size() == 0){
                        if(userHasRole) matchPass = true;
                    }else if(filterRule.getRoleSet().size() == 0 && filterRule.getPermSet().size() > 0){
                        if(userHasPerm) matchPass = true;
                    }else if(filterRule.getRoleSet().size() == 0 && filterRule.getPermSet().size() == 0){
                        matchPass = true;
                    }
                }
                log.debug("---------access={}, path={}, pattern={}, rule={}", matchPass, path, filterRule.getPattern(), filterRule.getRule());
                break;
            }
        }
        log.debug("------after do filter matchPass={}, path={}------", matchPass, path);
        return matchPass;
    }

    public String getLoginUrl() {
        return loginUrl;
    }

    public FilterCore setLoginUrl(String loginUrl) {
        this.loginUrl = loginUrl;
        return this;
    }

    public static void main(String[] args) {
        Set<String> rolesOfUser = new HashSet<>();
//        rolesOfUser.add("adminList");
//        rolesOfUser.add("adminAdd");
        rolesOfUser.add("adminSuper");

        Set<String> permsOfUser = new HashSet<>();
        permsOfUser.add("admin:*");

        FilterCore filterCore = new FilterCore();
        filterCore.init(null, "" +
                "#the [main] section must config\n" +
                "                [main]\n" +
                "                loginUrl = /toLogin\n" +
                "\n" +
                "\t\t\t\t#the [urls] section must config\n" +
                "                [urls]\n" +
                "                / = anon\n" +
                "                /static/** = anon\n" +
                "                /toLogin = anon\n" +
                "                /login = anon\n" +
                "                #/system/** = roles[系统管理员]\n" +
                "                /system/** = roles[系统管理员,系统管理员2], perms[user:add,user:delete,user:list,user*]\n" +
                "                /business/** = roles[业务员]\n" +
                "                /** = authc"+
                "");

        filterCore.doFilter("/", true, rolesOfUser, permsOfUser);
        filterCore.doFilter("/toLogin", true, rolesOfUser, permsOfUser);
        filterCore.doFilter("/static/images", true, rolesOfUser, permsOfUser);
        filterCore.doFilter("/static/js/jquery/jquery.js", true, rolesOfUser, permsOfUser);
        filterCore.doFilter("/system/permission/toUpdate", true, rolesOfUser, permsOfUser);
        filterCore.doFilter("/system/menu/add", true, rolesOfUser, permsOfUser);
        filterCore.doFilter("/system/role/add", false, rolesOfUser, permsOfUser);
    }
}
