
/**
* Author:Collonn, Email:collonn@126.com, QQ:195358385
*/
package com.jelly.eoss.model;

import java.math.BigDecimal;
import java.util.Date;

public class AdminFilterDefinition {
	public static final String Insert = "AdminFilterDefinition.Insert";
	public static final String Update = "AdminFilterDefinition.Update";
	public static final String UpdateWithNull = "AdminFilterDefinition.UpdateWithNull";
	public static final String DeleteByPk = "AdminFilterDefinition.DeleteByPk";
	public static final String DeleteByPojo = "AdminFilterDefinition.DeleteByPojo";
	public static final String Select = "AdminFilterDefinition.Select";
	public static final String SelectCount = "AdminFilterDefinition.SelectCount";
	public static final String SelectByPk = "AdminFilterDefinition.SelectByPk";
	
	private String id;
	
	private String rule;


	public AdminFilterDefinition setId (String id) {
		this.id = id;
		return this;
	}
	
	public String getId () {
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