package com.ydsn.tms.service.imp;

import java.util.List;

import com.ydsn.tms.dao.LoginDAO;
import com.ydsn.tms.po.xtgl_UserInfo;
import com.ydsn.tms.service.LoginService;

/**
 * ��½---ҵ���ʵ����
 *@author  ���
 *2015��7��8�� ����5:17:57
 */
public class LoginServiceImp implements LoginService{
   private LoginDAO log_dao;
   
   public List<xtgl_UserInfo> login(String user_name,String user_pwd){
	   System.out.println("----login sevice execute-------");
	  return log_dao.login(user_name, user_pwd);
   }
   
   
public LoginDAO getLog_dao() {
	return log_dao;
}

public void setLog_dao(LoginDAO log_dao) {
	this.log_dao = log_dao;
}
   
}
