package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.LoginDAO;
import com.ydsn.tms.po.xtgl_UserInfo;

/**
 *��½---���ݷ��ʲ�ʵ���� 
 *@author  ���
 *2015��7��8�� ����4:57:11
 */
public class LoginDAOImp extends BaseDAO<xtgl_UserInfo> implements LoginDAO{
    public List<xtgl_UserInfo> login(String user_name,String user_pwd){
    	 System.out.println("----login dao execute-------");
    	String hql="from xtgl_UserInfo u where u.user_name=? and u.user_pwd=?";
    	String[] params={user_name,user_pwd};
    	return super.login(hql, params);
    }
}
