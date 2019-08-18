package com.ydsn.tms.dao.imp;

import java.util.List;
import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.jcxx_CarStoreDAO;
import com.ydsn.tms.vo.jcxx_CarStore;

/**
 * ������Ϣģ��-��λ�Ϳⷿ��Ϣ���ݷ��ʣ�ʵ���ࣩ
 *@author  ���
 *2015��6��11�� ����5:34:44
 */
public class jcxx_CarStoreDAOImp extends BaseDAO<jcxx_CarStore> implements jcxx_CarStoreDAO{
    
	
	@Override
	public List<Object[]> findAll() {
		String sql="select car.*,sto.sto_name from cargoSpace car,storeroom sto where car.sto_id=sto.sto_id";
		return super.nativeFindAll(sql);
	}

	
	@Override
	public List<Object[]> findAllBySplite(int currentPage, int pageSize) {
		String sql="select car.*,sto.sto_name from cargoSpace car,storeroom sto where car.sto_id=sto.sto_id";
		return super.nativeFindBySplitePage(sql, currentPage, pageSize);
	}

	
	@Override
	public List<Object[]> findAllBySpliteAndLike(jcxx_CarStore car, int currentPage,int pageSize) {
		String sql="select car.*,sto.sto_name from cargoSpace car,storeroom sto where car.sto_id=sto.sto_id and car.car_bill like ? and car.car_desc like ? and car.car_remark like ?";
		String [] params={car.getCar_bill(),car.getCar_desc(),car.getCar_remark()};
		return super.nativeFindBySplitePageAndLike(sql, currentPage, pageSize, params);
	}


	
	@Override
	public List<Object[]> findAllByLike(jcxx_CarStore car) {
		String sql="select car.*,sto.sto_name from cargoSpace car,storeroom sto where car.sto_id=sto.sto_id and car.car_bill like ? and car.car_desc like ? and car.car_remark like ?";
		String [] params={car.getCar_bill(),car.getCar_desc(),car.getCar_remark()};
		return super.nativefindByLike(sql, params);
	}




}
