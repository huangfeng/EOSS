
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminRole;

import java.util.List;

public interface AdminRoleService {
    public void insert(AdminRole adminRole);
    public void update(AdminRole adminRole);
    public void UpdateWithNull(AdminRole adminRole);
    public void DeleteByPk(String pk);
    public void DeleteByPojo(AdminRole adminRole);
    public List<AdminRole> select(AdminRole adminRole);
    public Long SelectCount(AdminRole adminRole);
    public AdminRole selectByPrimaryKey(String pk);
}