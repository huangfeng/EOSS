package com.jelly.eoss.service;

import com.jelly.eoss.dao.BaseService;
import com.jelly.eoss.filter.SecurityFilter;
import com.jelly.eoss.model.AdminFilterDefinition;
import com.jelly.eoss.security.FilterCore;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FilterDefinitionReloadService {
    private static final Logger log = LoggerFactory.getLogger(FilterDefinitionReloadService.class);

    @Resource
    private BaseService baseService;

    public FilterCore reload(){
        AdminFilterDefinition filterDefinition = this.baseService.mySelectOne(AdminFilterDefinition.SelectByPk, 1);
        if(filterDefinition == null){
            throw new RuntimeException("表filter_definition中没有id=1的记录");
        }

//		String filterDefinition = filterConfig.getInitParameter("filterDefinition");
        String filterDefinitionStr = filterDefinition.getRule();
        log.info("================================= filterDefinition =================================");
        log.info(filterDefinitionStr);
        log.info("================================= filterDefinition =================================");

        String config = StringUtils.substringBetween(filterDefinitionStr, "[main]", "[urls]");
        String urls = StringUtils.substringAfter(filterDefinitionStr, "[urls]");
        FilterCore filterCore = new FilterCore();
        filterCore.init(config, urls);
        SecurityFilter.filterCore = filterCore;
        return filterCore;
    }
}
