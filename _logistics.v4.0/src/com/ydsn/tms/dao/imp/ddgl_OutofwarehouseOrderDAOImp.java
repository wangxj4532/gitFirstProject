package com.ydsn.tms.dao.imp;
import java.util.List;

import org.apache.log4j.Logger;

import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.ddgl_OutofwarehouseOrderDAO;
import com.ydsn.tms.po.ddgl_outofwarehouseOrder;
/**
 * 订单管理模块——业务层出库订单（实现类）
 * 
 *@author  孙军
 *2015年6月13日 下午9:36:31
 */
public class ddgl_OutofwarehouseOrderDAOImp extends BaseDAO<ddgl_outofwarehouseOrder> implements ddgl_OutofwarehouseOrderDAO{
	Logger logger=Logger.getLogger(ddgl_OutofwarehouseOrderDAOImp.class);
	@Override
	public void add(ddgl_outofwarehouseOrder out) {
		logger.warn("=====addDAO excuted success!!=======");
		super.add(out);
		
	}
	@Override
	public void update(ddgl_outofwarehouseOrder out) {
		super.update(out);
		
	}
	@Override
	public void delete(String chkdd_bill) {
		super.deleteById(ddgl_outofwarehouseOrder.class,chkdd_bill);
		
	}
	
	@Override
	public List<Object[]> findNameById(String chk_id) {
		String sql="select *from outofwarehouseOrder outu where outu.chkdd_bill='"+chk_id+"'";
		return super.findById(sql);
	}
	
	public List<Object[]> findIdByBill(String khchkdd_bill) {
		String sql="select *from outofwarehouseOrder outu where outu.khchkdd_bill='"+khchkdd_bill+"'";
		return super.findByName(sql);
	}
	
	public List<ddgl_outofwarehouseOrder> findAllBill() {
		String hql="from ddgl_outofwarehouseOrder";
		return super.findAll(hql);
	}

}











