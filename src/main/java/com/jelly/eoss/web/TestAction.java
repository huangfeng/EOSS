package com.jelly.eoss.web;

import com.jelly.eoss.dao.BaseDao;
import com.jelly.eoss.service.MenuManagerService;
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
	private BaseDao baseDao;
	@Autowired
	private MenuManagerService menuManagerService;
	
	@RequestMapping(value = "abc")
	public void queryRowBounds(HttpServletRequest request, HttpServletResponse response) throws Exception{
		
	}
	
	//getter and setter
	public MenuManagerService getMenuManagerService() {
		return menuManagerService;
	}
	
	public void setMenuManagerService(MenuManagerService menuManagerService) {
		this.menuManagerService = menuManagerService;
	}

	public BaseDao getBaseDao() {
		return baseDao;
	}

	public void setBaseDao(BaseDao baseDao) {
		this.baseDao = baseDao;
	}

	public static void main(String[] args) {
		System.out.println(Digest.GetMD5("111111" + "abc"));
	}
}
