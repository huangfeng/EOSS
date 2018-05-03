
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminMenu;

import java.util.List;

public interface AdminMenuService {
    public void insert(AdminMenu adminMenu);
    public void update(AdminMenu adminMenu);
    public void UpdateWithNull(AdminMenu adminMenu);
    public void DeleteByPk(String pk);
    public void DeleteByPojo(AdminMenu adminMenu);
    public List<AdminMenu> select(AdminMenu adminMenu);
    public Long SelectCount(AdminMenu adminMenu);
    public AdminMenu selectByPrimaryKey(String pk);
}