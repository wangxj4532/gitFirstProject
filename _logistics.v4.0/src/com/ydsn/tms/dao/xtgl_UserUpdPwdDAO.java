package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.xtgl_UserInfo;


/**
 * ϵͳ����ģ�顪���û������޸����ݷ��ʲ㣨�ӿڣ�
 *@author  ���
 *2015��6��12�� ����11:27:35
 */
public interface xtgl_UserUpdPwdDAO {
	  List<xtgl_UserInfo> vilPwd(String user_id,String old_pwd);
	  void submit(String user_id,String new_pwd);
}
