
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminMenu;
import com.jelly.eoss.service.AdminMenuService;
import com.jelly.eoss.dao.BaseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminMenuServiceImpl implements AdminMenuService{
	@Autowired
    private BaseDao baseDao;

	@Override
	public void insert(AdminMenu adminMenu) {
		baseDao.myInsert(AdminMenu.Insert, adminMenu);
	}

	@Override
	public void update(AdminMenu adminMenu) {
        baseDao.myUpdate(AdminMenu.Update, adminMenu);
	}

	@Override
	public void updateWithNull(AdminMenu adminMenu) {
        baseDao.myUpdate(AdminMenu.UpdateWithNull, adminMenu);
	}

	@Override
	public void deleteByPk(String pk) {
        baseDao.myDelete(AdminMenu.DeleteByPk, pk);
	}

	@Override
	public void deleteByPojo(AdminMenu adminMenu) {
        baseDao.myDelete(AdminMenu.DeleteByPojo, adminMenu);
	}

    @Override
	public List<AdminMenu> select(AdminMenu adminMenu) {
        return baseDao.mySelectList(AdminMenu.Select, adminMenu);
	}

    @Override
	public Long SelectCount(AdminMenu adminMenu) {
        return baseDao.mySelectOne(AdminMenu.SelectCount, adminMenu);
	}

	@Override
	public AdminMenu selectByPrimaryKey(String pk) {
        return baseDao.mySelectOne(AdminMenu.SelectByPk, pk);
	}

}