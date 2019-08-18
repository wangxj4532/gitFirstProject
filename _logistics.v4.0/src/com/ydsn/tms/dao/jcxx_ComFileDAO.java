package com.ydsn.tms.dao;

import java.util.List;

import com.ydsn.tms.po.ComFile;

/**
 * 基础信息 商品档案-接口
 *@author  孙军
 *2015年6月9日 上午9:55:00
 */
public interface jcxx_ComFileDAO {
    void add(ComFile com);
    void update(ComFile com);
    void deleteById(String g_id);
    List<Object[]> findByName(String rkddshp_id);
    List<ComFile> findCom();
	List<Object[]> findById(String g_id);
	List<Object[]> findByName2(String g_name);
}
