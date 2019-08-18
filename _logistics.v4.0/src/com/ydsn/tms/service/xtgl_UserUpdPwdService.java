package com.ydsn.tms.service;

import java.util.List;

import com.ydsn.tms.po.xtgl_UserInfo;


/**
 * 系统管理模块——用户修改密码业务层（接口类）
 *@author  孙军
 *2015年6月12日 上午8:53:41
 */
public interface xtgl_UserUpdPwdService {
	List<xtgl_UserInfo> vilPwd(String user_id, String old_pwd);
	void  submit(String user_id, String new_pwd);


}
