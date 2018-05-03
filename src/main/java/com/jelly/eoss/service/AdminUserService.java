
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminUser;

import java.util.List;

public interface AdminUserService {
    public void insert(AdminUser adminUser);
    public void update(AdminUser adminUser);
    public void UpdateWithNull(AdminUser adminUser);
    public void DeleteByPk(String pk);
    public void DeleteByPojo(AdminUser adminUser);
    public List<AdminUser> select(AdminUser adminUser);
    public Long SelectCount(AdminUser adminUser);
    public AdminUser selectByPrimaryKey(String pk);
}