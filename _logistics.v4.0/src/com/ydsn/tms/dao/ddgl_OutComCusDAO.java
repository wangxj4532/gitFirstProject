package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.vo.ddgl_OutComCus;

/**
 *ϵͳ����ģ��-�û��Ϳⷿ��Ϣ���ݷ��ʣ��ӿڣ� 
 *@author  ���
 *2015��6��11�� ����5:30:02
 */
public interface ddgl_OutComCusDAO {
    List<Object[]>  findAll();
    List<Object[]>  findAllByLike(ddgl_OutComCus occ);
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(ddgl_OutComCus occ,int currentPage,int pageSize);
}
