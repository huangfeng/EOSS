
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminUserMenu;

import java.util.List;

public interface AdminUserMenuService {
    public void insert(AdminUserMenu adminUserMenu);
    public void update(AdminUserMenu adminUserMenu);
    public void UpdateWithNull(AdminUserMenu adminUserMenu);
    public void DeleteByPk(String pk);
    public void DeleteByPojo(AdminUserMenu adminUserMenu);
    public List<AdminUserMenu> select(AdminUserMenu adminUserMenu);
    public Long SelectCount(AdminUserMenu adminUserMenu);
    public AdminUserMenu selectByPrimaryKey(String pk);
}