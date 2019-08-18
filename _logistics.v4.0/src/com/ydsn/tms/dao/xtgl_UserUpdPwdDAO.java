package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.xtgl_UserInfo;


/**
 * 系统管理模块——用户密码修改数据访问层（接口）
 *@author  孙军
 *2015年6月12日 上午11:27:35
 */
public interface xtgl_UserUpdPwdDAO {
	  List<xtgl_UserInfo> vilPwd(String user_id,String old_pwd);
	  void submit(String user_id,String new_pwd);
}
