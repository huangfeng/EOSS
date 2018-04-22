package com.jelly.eoss.filter;

import com.jelly.eoss.model.AdminUserRolesPerms;
import com.jelly.eoss.security.FilterCore;
import com.jelly.eoss.service.FilterDefinitionReloadService;
import com.jelly.eoss.util.Const;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

public class SecurityFilter implements Filter {
    private static final Logger log = LoggerFactory.getLogger(SecurityFilter.class);

	public static FilterCore filterCore;

	public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext servletContext = filterConfig.getServletContext();
        ApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        FilterDefinitionReloadService filterDefinitionReloadService = ctx.getBean(FilterDefinitionReloadService.class);
        filterDefinitionReloadService.reload();
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain filterChain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String contextPath = request.getServletContext().getContextPath();
        String uri = request.getRequestURI();
        String path = StringUtils.substringAfter(uri, contextPath);
        log.debug("contextPath={}, uri={}, path={}", contextPath, uri, path);

        AdminUserRolesPerms userRolesPerms = (AdminUserRolesPerms) request.getSession().getAttribute(Const.LOGIN_SESSION_KEY);
        Set<String> roleSet = null;
        Set<String> permSet = null;

        boolean authc = false;
        if(userRolesPerms != null){
            authc = true;
            roleSet = userRolesPerms.getRolesOfUser();
            permSet = userRolesPerms.getPermsOfUser();
        }
        log.debug("authc={}, roleSetOfUser={}, permSetOfUser={}", authc, roleSet, permSet);

        if(filterCore.doFilter(path, authc, roleSet, permSet)){
            filterChain.doFilter(request, response);
        }else{
            if(userRolesPerms == null){
                if(StringUtils.startsWith(path, filterCore.getLoginUrl())){
                    log.debug("is login url, pass, path={}, loginUrl={}", path, filterCore.getLoginUrl());
                    filterChain.doFilter(request, response);
                    return;
                }
                //跳转到登陆页面
                log.debug("security filter, deney, " + request.getRequestURI());
                String html = "<script type=\"text/javascript\">top.window.location.href=\"_BP_/toLogin\"</script>";
                html = html.replace("_BP_", Const.BASE_PATH);
                response.getWriter().write(html);
                return;
            }else{
//                request.getRequestDispatcher("/401.jsp").forward(request, response);
                response.getWriter().write("401！Not AuthorizationInfo");
            }
        }
	}

	public void destroy() {

	}
}
