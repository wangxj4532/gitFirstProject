package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.xtgl_UserInfo;

/**
 * ��½--���ݷ��ʲ�ӿ�
 *@author  ���
 *2015��7��8�� ����4:38:42
 */
public interface LoginDAO {
   List<xtgl_UserInfo> login(String user_name,String user_pwd);
}
