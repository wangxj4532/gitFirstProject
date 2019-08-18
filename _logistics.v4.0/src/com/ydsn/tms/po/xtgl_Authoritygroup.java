package com.ydsn.tms.po;
/**
 * 系统管理模块——权限组实体
 * 
 *@author  孙军
 *2015年6月12日 上午8:15:48
 */
public class xtgl_Authoritygroup {
    private String auth_id;
	private String auth_name;
	private String auth_level;
	public String getAuth_id() {
		return auth_id;
	}
	public void setAuth_id(String auth_id) {
		this.auth_id = auth_id;
	}
	public String getAuth_name() {
		return auth_name;
	}
	public void setAuth_name(String auth_name) {
		this.auth_name = auth_name;
	}
	public String getAuth_level() {
		return auth_level;
	}
	public void setAuth_level(String auth_level) {
		this.auth_level = auth_level;
	}
	public xtgl_Authoritygroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public xtgl_Authoritygroup(String auth_id, String auth_name, String auth_level) {
		super();
		this.auth_id = auth_id;
		this.auth_name = auth_name;
		this.auth_level = auth_level;
	}
	
}
