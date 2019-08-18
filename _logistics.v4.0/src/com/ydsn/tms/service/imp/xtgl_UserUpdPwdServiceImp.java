package com.ydsn.tms.service.imp;

import java.util.List;

import com.ydsn.tms.dao.xtgl_UserUpdPwdDAO;
import com.ydsn.tms.po.xtgl_UserInfo;
import com.ydsn.tms.service.xtgl_UserUpdPwdService;

/**
 * 系统管理模块——用户修改密码业务层（实现类）
 *@author  孙军
 *2015年6月12日 下午5:29:32
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
/**-------------------get/set方法和构造器----------------------------------------------------------------**/

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
