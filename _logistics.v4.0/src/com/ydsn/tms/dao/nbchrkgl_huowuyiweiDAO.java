package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.po.nbchrkgl_huowuyiwei;

/**
 * �ڲ���������ģ�顪��������λ���ݷ��ʲ㣨�ӿ��ࣩ
 *@author  ���
 *2015��6��15�� ����2:25:19
 */
public interface nbchrkgl_huowuyiweiDAO {
  void add(nbchrkgl_huowuyiwei yw);
  void update(nbchrkgl_huowuyiwei yw);
  void deleteById(String hwyw_bill);
  List<nbchrkgl_huowuyiwei> findAll();
  List<nbchrkgl_huowuyiwei> findByLike(nbchrkgl_huowuyiwei yw);
  List<nbchrkgl_huowuyiwei> findBySplite(int currentPage, int pageSize);
  List<nbchrkgl_huowuyiwei> findBySpliteAndLike(nbchrkgl_huowuyiwei yw,int currentPage, int pageSize);
}
