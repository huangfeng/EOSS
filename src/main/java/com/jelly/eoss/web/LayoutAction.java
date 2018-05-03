package com.jelly.eoss.web;

import com.jelly.eoss.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/system/layout")
public class LayoutAction extends BaseAction {
	@Autowired
	private BaseDao baseDao;

    @RequestMapping(value = "/main")
    public String main(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "/layout/main.jsp";
    }

    @RequestMapping(value = "/northAjax")
    public String northAjax(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/layout/northAjax.jsp";
    }
	
	@RequestMapping(value = "/center")
	public String center(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "/layout/center.jsp";
	}

    @RequestMapping(value = "/southAjax")
    public String southAjax(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "/layout/southAjax.jsp";
    }

    @RequestMapping(value = "/westAjax")
    public String westAjax(HttpServletRequest request, HttpServletResponse response) throws Exception {
        return "/layout/westAjax.jsp";
    }
	
	//getter and setter

	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
}
