package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.ddgl_enterwarehouseOrder;


/**
 *��������ģ��-�����Ϳͻ�����Ʒ��Ϣ���ݷ��ʣ��ӿڣ� 
 *@author  ���
 *2015��6��11�� ����5:30:02
 */

public interface ddgl_enterwarehouseOrderDAO {
    void add(ddgl_enterwarehouseOrder ent);
    void update(ddgl_enterwarehouseOrder ent);
    void delete(String rkdd_bill);
    List<Object[]> findNameById(String rkdd_bill);
    List<Object[]> findIdByBill(String khdd_bill);
    List<ddgl_enterwarehouseOrder> findAllBill();
}
