package com.ydsn.tms.service;

import java.util.List;

import com.ydsn.tms.po.jcxx_CargoSpace;
import com.ydsn.tms.vo.jcxx_CarStore;

/**
 * ������Ϣģ�顪��ҵ����λ�Ϳⷿ��ϢCRUD���ӿڣ�
 *@author  ���
 *2015��6��11�� ����5:53:31
 */
public interface jcxx_CarStoreService {
   void addCar(jcxx_CarStore car);
   void updateCar(jcxx_CarStore car);
   List<jcxx_CarStore> findAllBySpliteAndLike(jcxx_CarStore car,int currentPage,int pageSize);
   List<jcxx_CarStore> findAllBySplite(int currentPage,int pageSize);
   List<jcxx_CarStore> findAllByLike(jcxx_CarStore car);
   List<jcxx_CarStore> findAll();
   List<jcxx_CargoSpace> findCar();
}
