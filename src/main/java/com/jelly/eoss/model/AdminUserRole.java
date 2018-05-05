
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdminUserRole {
	public static final String Insert = "AdminUserRole.Insert";
	public static final String Update = "AdminUserRole.Update";
	public static final String UpdateWithNull = "AdminUserRole.UpdateWithNull";
	public static final String DeleteByPk = "AdminUserRole.DeleteByPk";
	public static final String DeleteByPojo = "AdminUserRole.DeleteByPojo";
	public static final String Select = "AdminUserRole.Select";
	public static final String SelectCount = "AdminUserRole.SelectCount";
	public static final String SelectByPk = "AdminUserRole.SelectByPk";
	
	private String userId;
	
	private String roleId;


	public AdminUserRole setUserId (String userId) {
		this.userId = userId;
		return this;
	}
	
	public String getUserId () {
		return this.userId;
	}

	public AdminUserRole setRoleId (String roleId) {
		this.roleId = roleId;
		return this;
	}
	
	public String getRoleId () {
		return this.roleId;
	}

}