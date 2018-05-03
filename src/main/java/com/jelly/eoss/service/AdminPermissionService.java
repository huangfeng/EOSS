
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminPermission;

import java.util.List;

public interface AdminPermissionService {
    public void insert(AdminPermission adminPermission);
    public void update(AdminPermission adminPermission);
    public void UpdateWithNull(AdminPermission adminPermission);
    public void DeleteByPk(String pk);
    public void DeleteByPojo(AdminPermission adminPermission);
    public List<AdminPermission> select(AdminPermission adminPermission);
    public Long SelectCount(AdminPermission adminPermission);
    public AdminPermission selectByPrimaryKey(String pk);
}