package com.ydsn.tms.dao.imp;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.xtgl_UserInfoDAO;
import com.ydsn.tms.po.xtgl_UserInfo;

/**
 *系统管理模块——用户信息 数据访问层（实现类）
 *@author  孙军
 *2015年6月11日 下午8:20:08
 */
public class xtgl_UserInfoDAOImp extends BaseDAO<xtgl_UserInfo> implements xtgl_UserInfoDAO{

	
	@Override
	public void add(xtgl_UserInfo user) {
		super.add(user);
		
	}

	
	@Override
	public void update(xtgl_UserInfo user) {
		super.update(user);
		
	}


}
