package com.ydsn.tms.service;

import java.util.List;

import com.ydsn.tms.po.xtgl_UserInfo;


/**
 *��½---ҵ��� �ӿ�
 *@author  ���
 *2015��7��8�� ����5:08:03
 */
public interface LoginService {
  List<xtgl_UserInfo> login(String user_name,String user_pwd);
}
