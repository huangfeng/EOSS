
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminFilterDefinition;

import java.util.List;

public interface AdminFilterDefinitionService {
    public void insert(AdminFilterDefinition adminFilterDefinition);
    public void update(AdminFilterDefinition adminFilterDefinition);
    public void UpdateWithNull(AdminFilterDefinition adminFilterDefinition);
    public void DeleteByPk(String pk);
    public void DeleteByPojo(AdminFilterDefinition adminFilterDefinition);
    public List<AdminFilterDefinition> select(AdminFilterDefinition adminFilterDefinition);
    public Long SelectCount(AdminFilterDefinition adminFilterDefinition);
    public AdminFilterDefinition selectByPrimaryKey(String pk);
}