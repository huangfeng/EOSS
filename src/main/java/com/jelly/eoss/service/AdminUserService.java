
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.service;

import com.jelly.eoss.model.AdminUser;

import java.util.List;

public interface AdminUserService {
    public void insert(AdminUser adminUser);
    public void update(AdminUser adminUser);
    public void updateWithNull(AdminUser adminUser);
    public void deleteByPk(String pk);
    public void deleteByPojo(AdminUser adminUser);
    public List<AdminUser> select(AdminUser adminUser);
    public AdminUser selectOne(AdminUser adminUser);
    public Long SelectCount(AdminUser adminUser);
    public AdminUser selectByPrimaryKey(String pk);
}