package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.jcxx_CargoSpace;

/**
 * 基础信息模块——数据访问层货位档案（接口）
 *@author  孙军
 *2015年6月11日 下午8:18:35
 */
public interface jcxx_CargoSpaceDAO {
    void add(jcxx_CargoSpace cargo);
    void update(jcxx_CargoSpace cargo);
	List<Object[]> findById(String car_id);
	List<Object[]> findByName2(String car_bill);
	List<jcxx_CargoSpace> findCar();
}
