package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.vo.nbchrkgl_YKSto;

/**
 * �ڲ���������ģ��--�����ƿ�ҵ���ӿ���
 *@author  ���
 *2015��6��15�� ����8:24:09
 */
public interface nbchrkgl_huowuyikuService {
   void addYK(nbchrkgl_YKSto yks);
   void updateYK(nbchrkgl_YKSto yks);
   void deleteById(String hwyk_bill);
   List< nbchrkgl_YKSto> findAll();
   List< nbchrkgl_YKSto> findByLike(nbchrkgl_YKSto yks);
   List< nbchrkgl_YKSto> findBySplite(int currentPage, int pageSize);
   List< nbchrkgl_YKSto> findBySpliteAndLike(nbchrkgl_YKSto yks,int currentPage, int pageSize);
}