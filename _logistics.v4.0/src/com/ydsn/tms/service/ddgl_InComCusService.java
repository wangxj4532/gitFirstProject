package com.ydsn.tms.service;

import java.util.List;
import com.ydsn.tms.po.ddgl_enterwarehouseOrder;
import com.ydsn.tms.vo.ddgl_InComCus;

/**
 * 订单管理模块——业务层入库订单CRUD（接口）
 *@author  孙军
 *2015年6月11日 下午5:53:31
 */
public interface ddgl_InComCusService {
   void addIn(ddgl_InComCus icc);
   void updateIn(ddgl_InComCus icc);
   void deleteById(ddgl_InComCus icc);
   List<ddgl_InComCus> findAllBySpliteAndLike(ddgl_InComCus icc,int currentPage,int pageSize);
   List<ddgl_InComCus> findAllBySplite(int currentPage,int pageSize);
   List<ddgl_InComCus> findAllByLike(ddgl_InComCus icc);
   List<ddgl_InComCus> findAll();
   List<ddgl_enterwarehouseOrder> findAllBill();
}
