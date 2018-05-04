
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminRolePermission;

import java.util.List;

public interface AdminRolePermissionService {
    public void insert(AdminRolePermission adminRolePermission);
    public void update(AdminRolePermission adminRolePermission);
    public void updateWithNull(AdminRolePermission adminRolePermission);
    public void deleteByPk(String pk);
    public void deleteByPojo(AdminRolePermission adminRolePermission);
    public List<AdminRolePermission> select(AdminRolePermission adminRolePermission);
    public AdminRolePermission selectOne(AdminRolePermission adminRolePermission);
    public Long SelectCount(AdminRolePermission adminRolePermission);
    public AdminRolePermission selectByPrimaryKey(String pk);
}