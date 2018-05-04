
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminUser;
import com.jelly.eoss.service.AdminUserService;
import com.jelly.eoss.dao.BaseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminUserServiceImpl implements AdminUserService{
	@Autowired
    private BaseDao baseDao;

	@Override
	public void insert(AdminUser adminUser) {
		baseDao.myInsert(AdminUser.Insert, adminUser);
	}

	@Override
	public void update(AdminUser adminUser) {
        baseDao.myUpdate(AdminUser.Update, adminUser);
	}

	@Override
	public void updateWithNull(AdminUser adminUser) {
        baseDao.myUpdate(AdminUser.UpdateWithNull, adminUser);
	}

	@Override
	public void deleteByPk(String pk) {
        baseDao.myDelete(AdminUser.DeleteByPk, pk);
	}

	@Override
	public void deleteByPojo(AdminUser adminUser) {
        baseDao.myDelete(AdminUser.DeleteByPojo, adminUser);
	}

    @Override
	public List<AdminUser> select(AdminUser adminUser) {
        return baseDao.mySelectList(AdminUser.Select, adminUser);
	}

	@Override
	public AdminUser selectOne(AdminUser adminUser) {
        List<AdminUser> list = baseDao.mySelectList(AdminUser.Select, adminUser);
        if(list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
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