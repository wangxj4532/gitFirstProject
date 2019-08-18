package com.ydsn.tms.service;

import java.util.List;

import com.ydsn.tms.po.ddgl_outofwarehouseOrder;
import com.ydsn.tms.vo.ddgl_OutComCus;

/**
 * 订单管理模块——业务层出库订单CRUD（接口）
 *@author  孙军
 *2015年6月11日 下午5:53:31
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
