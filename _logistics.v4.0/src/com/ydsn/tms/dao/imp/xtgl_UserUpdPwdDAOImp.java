package com.ydsn.tms.dao.imp;

import java.util.List;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.xtgl_UserUpdPwdDAO;
import com.ydsn.tms.po.xtgl_UserInfo;

/**
 *系统管理模块——修改密码数据访问层（实现类）
 *@author  孙军
 *2015年6月11日 下午8:20:08
 */
public class xtgl_UserUpdPwdDAOImp extends BaseDAO<xtgl_UserInfo> implements xtgl_UserUpdPwdDAO{

	@Override
	public List<xtgl_UserInfo> vilPwd(String user_id, String old_pwd) {
		System.out.println("==3=");
		String sql="from xtgl_UserInfo us where us.user_id=? and us.user_pwd=?";
		String [] params={user_id,old_pwd};
		return super.VilPwd(sql, params);
		
	}

	@Override
	public void submit(String user_id, String new_pwd) {
		System.out.println("==3=");
		String sql="update userInfo us set us.user_pwd='"+new_pwd+"' where us.user_id='"+user_id+"'";
		super.nativeSubmit(sql);
		
	}



	



}
