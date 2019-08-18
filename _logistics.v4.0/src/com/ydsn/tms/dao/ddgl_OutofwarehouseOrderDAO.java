package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.ddgl_outofwarehouseOrder;


/**
 *订单管理模块-订单和客户和商品信息数据访问（接口） 
 *@author  孙军
 *2015年6月11日 下午5:30:02
 */

public interface ddgl_OutofwarehouseOrderDAO {
    void add(ddgl_outofwarehouseOrder out);
    void update(ddgl_outofwarehouseOrder out);
    void delete(String chkdd_bill);
    List<Object[]> findNameById(String chk_id);
    List<Object[]> findIdByBill(String khchkdd_bill);
    List<ddgl_outofwarehouseOrder> findAllBill();
}
