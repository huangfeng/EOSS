
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminRolePermission;
import com.jelly.eoss.service.AdminRolePermissionService;
import com.jelly.eoss.dao.BaseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminRolePermissionServiceImpl implements AdminRolePermissionService{
	@Autowired
    private BaseDao baseDao;

	@Override
	public void insert(AdminRolePermission adminRolePermission) {
		baseDao.myInsert(AdminRolePermission.Insert, adminRolePermission);
	}

	@Override
	public void update(AdminRolePermission adminRolePermission) {
        baseDao.myUpdate(AdminRolePermission.Update, adminRolePermission);
	}

	@Override
	public void updateWithNull(AdminRolePermission adminRolePermission) {
        baseDao.myUpdate(AdminRolePermission.UpdateWithNull, adminRolePermission);
	}

	@Override
	public void deleteByPk(String pk) {
        baseDao.myDelete(AdminRolePermission.DeleteByPk, pk);
	}

	@Override
	public void deleteByPojo(AdminRolePermission adminRolePermission) {
        baseDao.myDelete(AdminRolePermission.DeleteByPojo, adminRolePermission);
	}

    @Override
	public List<AdminRolePermission> select(AdminRolePermission adminRolePermission) {
        return baseDao.mySelectList(AdminRolePermission.Select, adminRolePermission);
	}

    @Override
	public Long SelectCount(AdminRolePermission adminRolePermission) {
        return baseDao.mySelectOne(AdminRolePermission.SelectCount, adminRolePermission);
	}

	@Override
	public AdminRolePermission selectByPrimaryKey(String pk) {
        return baseDao.mySelectOne(AdminRolePermission.SelectByPk, pk);
	}

}