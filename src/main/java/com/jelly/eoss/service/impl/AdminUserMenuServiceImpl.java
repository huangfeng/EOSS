
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminUserMenu;
import com.jelly.eoss.service.AdminUserMenuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminUserMenuServiceImpl implements AdminUserMenuService{
	@Autowired
    private com.jelly.eoss.dao.BaseDao baseDao;

	@Override
	public void insert(AdminUserMenu adminUserMenu) {
		baseDao.myInsert(AdminUserMenu.Insert, adminUserMenu);
	}

	@Override
	public void update(AdminUserMenu adminUserMenu) {
        baseDao.myUpdate(AdminUserMenu.Update, adminUserMenu);
	}

	@Override
	public void UpdateWithNull(AdminUserMenu adminUserMenu) {
        baseDao.myUpdate(AdminUserMenu.UpdateWithNull, adminUserMenu);
	}

	@Override
	public void DeleteByPk(String pk) {
        baseDao.myDelete(AdminUserMenu.DeleteByPk, pk);
	}

	@Override
	public void DeleteByPojo(AdminUserMenu adminUserMenu) {
        baseDao.myDelete(AdminUserMenu.DeleteByPojo, adminUserMenu);
	}

    @Override
	public List<AdminUserMenu> select(AdminUserMenu adminUserMenu) {
        return baseDao.mySelectList(AdminUserMenu.Select, adminUserMenu);
	}

    @Override
	public Long SelectCount(AdminUserMenu adminUserMenu) {
        return baseDao.mySelectOne(AdminUserMenu.SelectCount, adminUserMenu);
	}

	@Override
	public AdminUserMenu selectByPrimaryKey(String pk) {
        return baseDao.mySelectOne(AdminUserMenu.SelectByPk, pk);
	}

}