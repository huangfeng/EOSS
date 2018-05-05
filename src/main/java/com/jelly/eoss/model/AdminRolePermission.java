
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdminRolePermission {
	public static final String Insert = "AdminRolePermission.Insert";
	public static final String Update = "AdminRolePermission.Update";
	public static final String UpdateWithNull = "AdminRolePermission.UpdateWithNull";
	public static final String DeleteByPk = "AdminRolePermission.DeleteByPk";
	public static final String DeleteByPojo = "AdminRolePermission.DeleteByPojo";
	public static final String Select = "AdminRolePermission.Select";
	public static final String SelectCount = "AdminRolePermission.SelectCount";
	public static final String SelectByPk = "AdminRolePermission.SelectByPk";
	
	private String permissionId;
	
	private String roleId;


	public AdminRolePermission setPermissionId (String permissionId) {
		this.permissionId = permissionId;
		return this;
	}
	
	public String getPermissionId () {
		return this.permissionId;
	}

	public AdminRolePermission setRoleId (String roleId) {
		this.roleId = roleId;
		return this;
	}
	
	public String getRoleId () {
		return this.roleId;
	}

}