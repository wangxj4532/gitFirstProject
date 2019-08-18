package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.vo.xtgl_UserStore;

/**
 *系统管理模块-用户和库房信息数据访问（接口） 
 *@author  孙军
 *2015年6月11日 下午5:30:02
 */
public interface xtgl_UserStoreDAO {
    List<Object[]>  findAll();
    List<Object[]>  findAllByLike(xtgl_UserStore us);
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(xtgl_UserStore us,int currentPage,int pageSize);
}
