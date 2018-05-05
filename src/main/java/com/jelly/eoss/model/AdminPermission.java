
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdminPermission {
	public static final String Insert = "AdminPermission.Insert";
	public static final String Update = "AdminPermission.Update";
	public static final String UpdateWithNull = "AdminPermission.UpdateWithNull";
	public static final String DeleteByPk = "AdminPermission.DeleteByPk";
	public static final String DeleteByPojo = "AdminPermission.DeleteByPojo";
	public static final String Select = "AdminPermission.Select";
	public static final String SelectCount = "AdminPermission.SelectCount";
	public static final String SelectByPk = "AdminPermission.SelectByPk";
	
	private String id;
	
	private String name;


	public AdminPermission setId (String id) {
		this.id = id;
		return this;
	}
	
	public String getId () {
		return this.id;
	}

	public AdminPermission setName (String name) {
		this.name = name;
		return this;
	}
	
	public String getName () {
		return this.name;
	}

}