package com.ydsn.tms.dao;

import java.util.List;
import com.ydsn.tms.vo.xtgl_UserStore;

/**
 *ϵͳ����ģ��-�û��Ϳⷿ��Ϣ���ݷ��ʣ��ӿڣ� 
 *@author  ���
 *2015��6��11�� ����5:30:02
 */
public interface xtgl_UserStoreDAO {
    List<Object[]>  findAll();
    List<Object[]>  findAllByLike(xtgl_UserStore us);
	List<Object[]>  findAllBySplite(int currentPage,int pageSize);
	List<Object[]>  findAllBySpliteAndLike(xtgl_UserStore us,int currentPage,int pageSize);
}
