package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.jcxx_CargoSpace;

/**
 * ������Ϣģ�顪�����ݷ��ʲ��λ�������ӿڣ�
 *@author  ���
 *2015��6��11�� ����8:18:35
 */
public interface jcxx_CargoSpaceDAO {
    void add(jcxx_CargoSpace cargo);
    void update(jcxx_CargoSpace cargo);
	List<Object[]> findById(String car_id);
	List<Object[]> findByName2(String car_bill);
	List<jcxx_CargoSpace> findCar();
}
