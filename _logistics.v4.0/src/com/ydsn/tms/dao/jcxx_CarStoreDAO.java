package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.vo.jcxx_CarStore;

/**
 *������Ϣģ��-��λ�Ϳⷿ��Ϣ���ݷ��ʣ��ӿڣ� 
 *@author  ���
 *2015��6��11�� ����5:30:02
 */
public interface jcxx_CarStoreDAO {
    List<Object[]>  findAll();
    List<Object[]>  findAllByLike(jcxx_CarStore car);
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(jcxx_CarStore car,int currentPage,int pageSize);
}
