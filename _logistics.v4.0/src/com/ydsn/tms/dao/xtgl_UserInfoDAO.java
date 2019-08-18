package com.ydsn.tms.dao;

import com.ydsn.tms.po.xtgl_UserInfo;

/**
 * 系统管理模块——用户信息 数据访问层（接口）
 *@author  孙军
 *2015年6月12日 上午11:27:35
 */
public interface xtgl_UserInfoDAO {
	  void add(xtgl_UserInfo user);
	  void update(xtgl_UserInfo user);
}
