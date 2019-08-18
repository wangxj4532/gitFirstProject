package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.ddgl_enterwarehouseOrder;


/**
 *订单管理模块-订单和客户和商品信息数据访问（接口） 
 *@author  孙军
 *2015年6月11日 下午5:30:02
 */

public interface ddgl_enterwarehouseOrderDAO {
    void add(ddgl_enterwarehouseOrder ent);
    void update(ddgl_enterwarehouseOrder ent);
    void delete(String rkdd_bill);
    List<Object[]> findNameById(String rkdd_bill);
    List<Object[]> findIdByBill(String khdd_bill);
    List<ddgl_enterwarehouseOrder> findAllBill();
}
