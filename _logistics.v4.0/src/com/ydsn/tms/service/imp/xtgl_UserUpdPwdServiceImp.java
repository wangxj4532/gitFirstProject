package com.ydsn.tms.service.imp;

import java.util.List;

import com.ydsn.tms.dao.xtgl_UserUpdPwdDAO;
import com.ydsn.tms.po.xtgl_UserInfo;
import com.ydsn.tms.service.xtgl_UserUpdPwdService;

/**
 * ϵͳ����ģ�顪���û��޸�����ҵ��㣨ʵ���ࣩ
 *@author  ���
 *2015��6��12�� ����5:29:32
 */
public class xtgl_UserUpdPwdServiceImp implements xtgl_UserUpdPwdService{
    private xtgl_UserUpdPwdDAO pwddao;
	@Override
	public List<xtgl_UserInfo> vilPwd(String user_id, String old_pwd) {
		return pwddao.vilPwd(user_id, old_pwd);
	}

	@Override
	public void submit(String user_id, String new_pwd) {
		System.out.println("==2=");
		pwddao.submit(user_id, new_pwd);
		
	}
/**-------------------get/set�����͹�����----------------------------------------------------------------**/

	public xtgl_UserUpdPwdDAO getPwddao() {
		return pwddao;
	}

	public void setPwddao(xtgl_UserUpdPwdDAO pwddao) {
		this.pwddao = pwddao;
	}

	public xtgl_UserUpdPwdServiceImp() {
	}

	public xtgl_UserUpdPwdServiceImp(xtgl_UserUpdPwdDAO pwddao) {
		this.pwddao = pwddao;
	}
     
}
