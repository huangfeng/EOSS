
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service.impl;


import com.jelly.eoss.model.AdminFilterDefinition;
import com.jelly.eoss.service.AdminFilterDefinitionService;
import com.jelly.eoss.dao.BaseDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminFilterDefinitionServiceImpl implements AdminFilterDefinitionService{
	@Autowired
    private BaseDao baseDao;

	@Override
	public void insert(AdminFilterDefinition adminFilterDefinition) {
		baseDao.myInsert(AdminFilterDefinition.Insert, adminFilterDefinition);
	}

	@Override
	public void update(AdminFilterDefinition adminFilterDefinition) {
        baseDao.myUpdate(AdminFilterDefinition.Update, adminFilterDefinition);
	}

	@Override
	public void updateWithNull(AdminFilterDefinition adminFilterDefinition) {
        baseDao.myUpdate(AdminFilterDefinition.UpdateWithNull, adminFilterDefinition);
	}

	@Override
	public void deleteByPk(String pk) {
        baseDao.myDelete(AdminFilterDefinition.DeleteByPk, pk);
	}

	@Override
	public void deleteByPojo(AdminFilterDefinition adminFilterDefinition) {
        baseDao.myDelete(AdminFilterDefinition.DeleteByPojo, adminFilterDefinition);
	}

    @Override
	public List<AdminFilterDefinition> select(AdminFilterDefinition adminFilterDefinition) {
        return baseDao.mySelectList(AdminFilterDefinition.Select, adminFilterDefinition);
	}

	@Override
	public AdminFilterDefinition selectOne(AdminFilterDefinition adminFilterDefinition) {
        List<AdminFilterDefinition> list = baseDao.mySelectList(AdminFilterDefinition.Select, adminFilterDefinition);
        if(list == null || list.size() == 0){
            return null;
        }
        return list.get(0);
	}

    @Override
	public Long SelectCount(AdminFilterDefinition adminFilterDefinition) {
        return baseDao.mySelectOne(AdminFilterDefinition.SelectCount, adminFilterDefinition);
	}

	@Override
	public AdminFilterDefinition selectByPrimaryKey(String pk) {
        return baseDao.mySelectOne(AdminFilterDefinition.SelectByPk, pk);
	}

}