
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminUser;
import com.jelly.eoss.service.AdminUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminUserServiceImpl implements AdminUserService{
	@Autowired
    private com.jelly.eoss.dao.BaseDao baseDao;

	@Override
	public void insert(AdminUser adminUser) {
		baseDao.myInsert(AdminUser.Insert, adminUser);
	}

	@Override
	public void update(AdminUser adminUser) {
        baseDao.myUpdate(AdminUser.Update, adminUser);
	}

	@Override
	public void UpdateWithNull(AdminUser adminUser) {
        baseDao.myUpdate(AdminUser.UpdateWithNull, adminUser);
	}

	@Override
	public void DeleteByPk(String pk) {
        baseDao.myDelete(AdminUser.DeleteByPk, pk);
	}

	@Override
	public void DeleteByPojo(AdminUser adminUser) {
        baseDao.myDelete(AdminUser.DeleteByPojo, adminUser);
	}

    @Override
	public List<AdminUser> select(AdminUser adminUser) {
        return baseDao.mySelectList(AdminUser.Select, adminUser);
	}

    @Override
	public Long SelectCount(AdminUser adminUser) {
        return baseDao.mySelectOne(AdminUser.SelectCount, adminUser);
	}

	@Override
	public AdminUser selectByPrimaryKey(String pk) {
        return baseDao.mySelectOne(AdminUser.SelectByPk, pk);
	}

}