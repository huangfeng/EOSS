
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminUserRole;

import java.util.List;

public interface AdminUserRoleService {
    public void insert(AdminUserRole adminUserRole);
    public void update(AdminUserRole adminUserRole);
    public void updateWithNull(AdminUserRole adminUserRole);
    public void deleteByPk(String pk);
    public void deleteByPojo(AdminUserRole adminUserRole);
    public List<AdminUserRole> select(AdminUserRole adminUserRole);
    public Long SelectCount(AdminUserRole adminUserRole);
    public AdminUserRole selectByPrimaryKey(String pk);
}