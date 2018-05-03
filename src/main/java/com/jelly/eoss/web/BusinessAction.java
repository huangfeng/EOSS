package com.jelly.eoss.web;

import com.jelly.eoss.dao.BaseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/business/money")
public class BusinessAction extends BaseAction {
	@Autowired
	private BaseDao baseDao;

    @RequestMapping(value = "/list")
    public void center(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("/business/money/list");
    }

    @RequestMapping(value = "/add")
    public void main(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("/business/money/add");
    }

    @RequestMapping(value = "/delete")
    public void northAjax(HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.getWriter().write("/business/money/delete");
    }
	
	//getter and setter

	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}
}
