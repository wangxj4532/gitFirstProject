package com.ydsn.tms.service;

import java.util.List;

import com.ydsn.tms.po.xtgl_UserInfo;


/**
 *登陆---业务层 接口
 *@author  孙军
 *2015年7月8日 下午5:08:03
 */
public interface LoginService {
  List<xtgl_UserInfo> login(String user_name,String user_pwd);
}
