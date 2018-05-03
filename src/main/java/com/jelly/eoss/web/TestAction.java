package com.jelly.eoss.web;

import com.jelly.eoss.dao.BaseService;
import com.jelly.eoss.service.MenuService;
import com.jelly.eoss.util.security.Digest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/test")
public class TestAction extends BaseAction{
	@Autowired
	private BaseService baseDao;
	@Autowired
	private MenuService menuService;
	
	@RequestMapping(value = "abc")
	public void queryRowBounds(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
	}
	
	//getter and setter
	public MenuService getMenuService() {
		return menuService;
	}
	
	public void setMenuService(MenuService menuService) {
		this.menuService = menuService;
	}

	public BaseService getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseService baseDao) {
		this.baseDao = baseDao;
	}

	public static void main(String[] args) {
		System.out.println(Digest.GetMD5("111111" + "abc"));
	}
}
