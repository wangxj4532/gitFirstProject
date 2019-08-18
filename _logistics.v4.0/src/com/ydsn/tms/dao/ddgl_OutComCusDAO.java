package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.vo.ddgl_OutComCus;

/**
 *系统管理模块-用户和库房信息数据访问（接口） 
 *@author  孙军
 *2015年6月11日 下午5:30:02
 */
public interface ddgl_OutComCusDAO {
    List<Object[]>  findAll();
    List<Object[]>  findAllByLike(ddgl_OutComCus occ);
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(ddgl_OutComCus occ,int currentPage,int pageSize);
}
