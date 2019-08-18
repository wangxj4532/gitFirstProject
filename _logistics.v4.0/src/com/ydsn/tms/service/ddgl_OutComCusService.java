package com.ydsn.tms.service;

import java.util.List;

import com.ydsn.tms.po.ddgl_outofwarehouseOrder;
import com.ydsn.tms.vo.ddgl_OutComCus;

/**
 * ��������ģ�顪��ҵ�����ⶩ��CRUD���ӿڣ�
 *@author  ���
 *2015��6��11�� ����5:53:31
 */
public interface ddgl_OutComCusService {
   void addOut(ddgl_OutComCus occ);
   void updateOut(ddgl_OutComCus occ);
   void deleteById(ddgl_OutComCus occ);
   List<ddgl_OutComCus> findAllBySpliteAndLike(ddgl_OutComCus occ,int currentPage,int pageSize);
   List<ddgl_OutComCus> findAllBySplite(int currentPage,int pageSize);
   List<ddgl_OutComCus> findAllByLike(ddgl_OutComCus occ);
   List<ddgl_OutComCus> findAll();
   List<ddgl_outofwarehouseOrder> findAllBill();
}
