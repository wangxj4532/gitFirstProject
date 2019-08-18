package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.xtgl_UserInfo;

/**
 * 登陆--数据访问层接口
 *@author  孙军
 *2015年7月8日 下午4:38:42
 */
public interface LoginDAO {
   List<xtgl_UserInfo> login(String user_name,String user_pwd);
}
