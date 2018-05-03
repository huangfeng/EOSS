
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.model;

public class AdminFilterDefinition {
	public static final String Insert = "com.jelly.eoss.model.AdminFilterDefinition.Insert";
	public static final String Update = "com.jelly.eoss.model.AdminFilterDefinition.Update";
	public static final String UpdateWithNull = "com.jelly.eoss.model.AdminFilterDefinition.UpdateWithNull";
	public static final String DeleteByPk = "com.jelly.eoss.model.AdminFilterDefinition.DeleteByPk";
	public static final String DeleteByPojo = "com.jelly.eoss.model.AdminFilterDefinition.DeleteByPojo";
	public static final String Select = "com.jelly.eoss.model.AdminFilterDefinition.Select";
	public static final String SelectCount = "com.jelly.eoss.model.AdminFilterDefinition.SelectCount";
	public static final String SelectByPk = "com.jelly.eoss.model.AdminFilterDefinition.SelectByPk";
	
	private Integer id;
	
	private String rule;


	public AdminFilterDefinition setId (Integer id) {
		this.id = id;
		return this;
	}
	
	public Integer getId () {
		return this.id;
	}

	public AdminFilterDefinition setRule (String rule) {
		this.rule = rule;
		return this;
	}
	
	public String getRule () {
		return this.rule;
	}

}