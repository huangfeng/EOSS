
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdminUser {
	public static final String Insert = "AdminUser.Insert";
	public static final String Update = "AdminUser.Update";
	public static final String UpdateWithNull = "AdminUser.UpdateWithNull";
	public static final String DeleteByPk = "AdminUser.DeleteByPk";
	public static final String DeleteByPojo = "AdminUser.DeleteByPojo";
	public static final String Select = "AdminUser.Select";
	public static final String SelectCount = "AdminUser.SelectCount";
	public static final String SelectByPk = "AdminUser.SelectByPk";
	
	private String id;
	
	private String username;
	
	private String password;
	
	private String salt;
	
	private String createDatetime;


	public AdminUser setId (String id) {
		this.id = id;
		return this;
	}
	
	public String getId () {
		return this.id;
	}

	public AdminUser setUsername (String username) {
		this.username = username;
		return this;
	}
	
	public String getUsername () {
		return this.username;
	}

	public AdminUser setPassword (String password) {
		this.password = password;
		return this;
	}
	
	public String getPassword () {
		return this.password;
	}

	public AdminUser setSalt (String salt) {
		this.salt = salt;
		return this;
	}
	
	public String getSalt () {
		return this.salt;
	}

	public AdminUser setCreateDatetime (String createDatetime) {
		this.createDatetime = createDatetime;
		return this;
	}
	
	public String getCreateDatetime () {
		return this.createDatetime;
	}

}