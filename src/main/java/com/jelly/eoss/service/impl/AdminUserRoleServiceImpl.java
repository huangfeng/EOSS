
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminUserRole;
import com.jelly.eoss.service.AdminUserRoleService;
import com.jelly.eoss.dao.BaseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminUserRoleServiceImpl implements AdminUserRoleService{
	@Autowired
    private BaseDao baseDao;

	@Override
	public void insert(AdminUserRole adminUserRole) {
		baseDao.myInsert(AdminUserRole.Insert, adminUserRole);
	}

	@Override
	public void update(AdminUserRole adminUserRole) {
        baseDao.myUpdate(AdminUserRole.Update, adminUserRole);
	}

	@Override
	public void updateWithNull(AdminUserRole adminUserRole) {
        baseDao.myUpdate(AdminUserRole.UpdateWithNull, adminUserRole);
	}

	@Override
	public void deleteByPk(String pk) {
        baseDao.myDelete(AdminUserRole.DeleteByPk, pk);
	}

	@Override
	public void deleteByPojo(AdminUserRole adminUserRole) {
        baseDao.myDelete(AdminUserRole.DeleteByPojo, adminUserRole);
	}

    @Override
	public List<AdminUserRole> select(AdminUserRole adminUserRole) {
        return baseDao.mySelectList(AdminUserRole.Select, adminUserRole);
	}

    @Override
	public Long SelectCount(AdminUserRole adminUserRole) {
        return baseDao.mySelectOne(AdminUserRole.SelectCount, adminUserRole);
	}

	@Override
	public AdminUserRole selectByPrimaryKey(String pk) {
        return baseDao.mySelectOne(AdminUserRole.SelectByPk, pk);
	}

}