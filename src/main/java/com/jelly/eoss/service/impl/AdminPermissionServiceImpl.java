
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminPermission;
import com.jelly.eoss.service.AdminPermissionService;
import com.jelly.eoss.dao.BaseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminPermissionServiceImpl implements AdminPermissionService{
	@Autowired
    private BaseDao baseDao;

	@Override
	public void insert(AdminPermission adminPermission) {
		baseDao.myInsert(AdminPermission.Insert, adminPermission);
	}

	@Override
	public void update(AdminPermission adminPermission) {
        baseDao.myUpdate(AdminPermission.Update, adminPermission);
	}

	@Override
	public void updateWithNull(AdminPermission adminPermission) {
        baseDao.myUpdate(AdminPermission.UpdateWithNull, adminPermission);
	}

	@Override
	public void deleteByPk(String pk) {
        baseDao.myDelete(AdminPermission.DeleteByPk, pk);
	}

	@Override
	public void deleteByPojo(AdminPermission adminPermission) {
        baseDao.myDelete(AdminPermission.DeleteByPojo, adminPermission);
	}

    @Override
	public List<AdminPermission> select(AdminPermission adminPermission) {
        return baseDao.mySelectList(AdminPermission.Select, adminPermission);
	}

	@Override
	public AdminPermission selectOne(AdminPermission adminPermission) {
        List<AdminPermission> list = baseDao.mySelectList(AdminPermission.Select, adminPermission);
        if(list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
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