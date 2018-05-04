
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminRole;
import com.jelly.eoss.service.AdminRoleService;
import com.jelly.eoss.dao.BaseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminRoleServiceImpl implements AdminRoleService{
	@Autowired
    private BaseDao baseDao;

	@Override
	public void insert(AdminRole adminRole) {
		baseDao.myInsert(AdminRole.Insert, adminRole);
	}

	@Override
	public void update(AdminRole adminRole) {
        baseDao.myUpdate(AdminRole.Update, adminRole);
	}

	@Override
	public void updateWithNull(AdminRole adminRole) {
        baseDao.myUpdate(AdminRole.UpdateWithNull, adminRole);
	}

	@Override
	public void deleteByPk(String pk) {
        baseDao.myDelete(AdminRole.DeleteByPk, pk);
	}

	@Override
	public void deleteByPojo(AdminRole adminRole) {
        baseDao.myDelete(AdminRole.DeleteByPojo, adminRole);
	}

    @Override
	public List<AdminRole> select(AdminRole adminRole) {
        return baseDao.mySelectList(AdminRole.Select, adminRole);
	}

	@Override
	public AdminRole selectOne(AdminRole adminRole) {
        List<AdminRole> list = baseDao.mySelectList(AdminRole.Select, adminRole);
        if(list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
	}

    @Override
	public Long SelectCount(AdminRole adminRole) {
        return baseDao.mySelectOne(AdminRole.SelectCount, adminRole);
	}

	@Override
	public AdminRole selectByPrimaryKey(String pk) {
        return baseDao.mySelectOne(AdminRole.SelectByPk, pk);
	}

}