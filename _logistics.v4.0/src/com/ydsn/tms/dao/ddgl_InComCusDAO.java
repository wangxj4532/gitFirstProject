package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.vo.ddgl_InComCus;

/**
 *ϵͳ����ģ��-�û��Ϳⷿ��Ϣ���ݷ��ʣ��ӿڣ� 
 *@author  ���
 *2015��6��11�� ����5:30:02
 */
public interface ddgl_InComCusDAO {
    List<Object[]>  findAll();
    List<Object[]>  findAllByLike(ddgl_InComCus icc);
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(ddgl_InComCus icc,int currentPage,int pageSize);
}
