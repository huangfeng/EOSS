
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminPermission;
import com.jelly.eoss.service.AdminPermissionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdminPermissionServiceImpl implements AdminPermissionService{
	@Autowired
    private com.jelly.eoss.dao.BaseDao baseDao;

	@Override
	public void insert(AdminPermission adminPermission) {
		baseDao.myInsert(AdminPermission.Insert, adminPermission);
	}

	@Override
	public void update(AdminPermission adminPermission) {
        baseDao.myUpdate(AdminPermission.Update, adminPermission);
	}

	@Override
	public void UpdateWithNull(AdminPermission adminPermission) {
        baseDao.myUpdate(AdminPermission.UpdateWithNull, adminPermission);
	}

	@Override
	public void DeleteByPk(String pk) {
        baseDao.myDelete(AdminPermission.DeleteByPk, pk);
	}

	@Override
	public void DeleteByPojo(AdminPermission adminPermission) {
        baseDao.myDelete(AdminPermission.DeleteByPojo, adminPermission);
	}

    @Override
	public List<AdminPermission> select(AdminPermission adminPermission) {
        return baseDao.mySelectList(AdminPermission.Select, adminPermission);
	}

    @Override
	public Long SelectCount(AdminPermission adminPermission) {
        return baseDao.mySelectOne(AdminPermission.SelectCount, adminPermission);
	}

	@Override
	public AdminPermission selectByPrimaryKey(String pk) {
        return baseDao.mySelectOne(AdminPermission.SelectByPk, pk);
	}

}