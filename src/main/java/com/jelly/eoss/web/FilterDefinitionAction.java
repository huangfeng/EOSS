package com.jelly.eoss.web;

import com.jelly.eoss.dao.BaseService;
import com.jelly.eoss.model.AdminFilterDefinition;
import com.jelly.eoss.service.FilterDefinitionReloadService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/system/filterDefinition")
public class FilterDefinitionAction extends BaseAction{
	@Autowired
	private BaseService baseService;
	@Autowired
	FilterDefinitionReloadService filterDefinitionReloadService;

	@RequestMapping(value = "/toUpdate")
	public ModelAndView toUpdate(HttpServletRequest request, HttpServletResponse response) throws Exception{
		AdminFilterDefinition filterDefinition = this.baseService.mySelectOne(AdminFilterDefinition.SelectByPk, 1);
		request.setAttribute("filterDefinition", filterDefinition);
		return new ModelAndView("/system/filterDefinition.jsp");
	}
	
	@RequestMapping(value = "/update")
	public ModelAndView update(HttpServletRequest request, HttpServletResponse response, AdminFilterDefinition filterDefinition) throws Exception{
		filterDefinition.setRule(StringUtils.trimToNull(filterDefinition.getRule()));

		this.baseService.myUpdate(AdminFilterDefinition.UpdateWithNull, filterDefinition);
        filterDefinitionReloadService.reload();
        request.getRequestDispatcher("/system/filterDefinition/toUpdate").forward(request, response);

		return null;
	}
	
	//getter and setter
	public BaseService getBaseDao() {
		return baseService;
	}

	public void setBaseDao(BaseService baseDao) {
		this.baseService = baseDao;
	}
}
