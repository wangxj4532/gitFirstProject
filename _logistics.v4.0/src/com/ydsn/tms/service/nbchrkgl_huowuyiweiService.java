package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.nbchrkgl_YWVO;

/**
 *�ڲ���������ģ�顪��������λҵ��㣨�ӿ��ࣩ 
 *@author  ���
 *2015��6��15�� ����2:48:14
 */
public interface nbchrkgl_huowuyiweiService {
   void add(nbchrkgl_YWVO ywvo);
   void update(nbchrkgl_YWVO ywvo);
   void deleteById(String hwyw_bill);
   List<nbchrkgl_YWVO> findAll();
   List< nbchrkgl_YWVO> findByLike(nbchrkgl_YWVO ywvo);
   List< nbchrkgl_YWVO> findBySplite(int currentPage, int pageSize);
   List< nbchrkgl_YWVO> findBySpliteAndLike(nbchrkgl_YWVO ywvo,int currentPage, int pageSize);
}
