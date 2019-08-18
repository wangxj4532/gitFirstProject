package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.vo.jcxx_CarStore;

/**
 *基础信息模块-货位和库房信息数据访问（接口） 
 *@author  孙军
 *2015年6月11日 下午5:30:02
 */
public interface jcxx_CarStoreDAO {
    List<Object[]>  findAll();
    List<Object[]>  findAllByLike(jcxx_CarStore car);
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(jcxx_CarStore car,int currentPage,int pageSize);
}
