package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.ddgl_outofwarehouseOrder;


/**
 *��������ģ��-�����Ϳͻ�����Ʒ��Ϣ���ݷ��ʣ��ӿڣ� 
 *@author  ���
 *2015��6��11�� ����5:30:02
 */

public interface ddgl_OutofwarehouseOrderDAO {
    void add(ddgl_outofwarehouseOrder out);
    void update(ddgl_outofwarehouseOrder out);
    void delete(String chkdd_bill);
    List<Object[]> findNameById(String chk_id);
    List<Object[]> findIdByBill(String khchkdd_bill);
    List<ddgl_outofwarehouseOrder> findAllBill();
}
