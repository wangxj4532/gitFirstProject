package com.ydsn.tms.po;

public class xtgl_UserInfo {
  private String user_id;    
  private String user_mch;
  private String user_name;
  private String user_pwd;
  private String stm_id;
public String getUser_id() {
	return user_id;
}
public void setUser_id(String user_id) {
	this.user_id = user_id;
}
public String getUser_mch() {
	return user_mch;
}
public void setUser_mch(String user_mch) {
	this.user_mch = user_mch;
}
public String getUser_name() {
	return user_name;
}
public void setUser_name(String user_name) {
	this.user_name = user_name;
}
public String getUser_pwd() {
	return user_pwd;
}
public void setUser_pwd(String user_pwd) {
	this.user_pwd = user_pwd;
}
public String getStm_id() {
	return stm_id;
}
public void setStm_id(String stm_id) {
	this.stm_id = stm_id;
}
public xtgl_UserInfo() {
	super();
	// TODO Auto-generated constructor stub
}
public xtgl_UserInfo(String user_id, String user_mch, String user_name,
		String user_pwd, String stm_id) {
	super();
	this.user_id = user_id;
	this.user_mch = user_mch;
	this.user_name = user_name;
	this.user_pwd = user_pwd;
	this.stm_id = stm_id;
}
  
}
