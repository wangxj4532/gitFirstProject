package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.ComFile;

/**
 * ������Ϣ ��Ʒ����-�ӿ�
 *@author  ���
 *2015��6��9�� ����9:55:00
 */
public interface jcxx_ComFileDAO {
    void add(ComFile com);
    void update(ComFile com);
    void deleteById(String g_id);
    List<Object[]> findByName(String rkddshp_id);
    List<ComFile> findCom();
	List<Object[]> findById(String g_id);
	List<Object[]> findByName2(String g_name);
}
