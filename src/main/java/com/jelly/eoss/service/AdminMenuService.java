
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminMenu;

import java.util.List;

public interface AdminMenuService {
    public void insert(AdminMenu adminMenu);
    public void update(AdminMenu adminMenu);
    public void updateWithNull(AdminMenu adminMenu);
    public void deleteByPk(String pk);
    public void deleteByPojo(AdminMenu adminMenu);
    public List<AdminMenu> select(AdminMenu adminMenu);
    public AdminMenu selectOne(AdminMenu adminMenu);
    public Long SelectCount(AdminMenu adminMenu);
    public AdminMenu selectByPrimaryKey(String pk);
}