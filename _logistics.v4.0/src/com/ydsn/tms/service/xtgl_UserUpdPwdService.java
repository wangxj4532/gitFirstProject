package com.ydsn.tms.service;

import java.util.List;

import com.ydsn.tms.po.xtgl_UserInfo;


/**
 * ϵͳ����ģ�顪���û��޸�����ҵ��㣨�ӿ��ࣩ
 *@author  ���
 *2015��6��12�� ����8:53:41
 */
public interface xtgl_UserUpdPwdService {
	List<xtgl_UserInfo> vilPwd(String user_id, String old_pwd);
	void  submit(String user_id, String new_pwd);


}
