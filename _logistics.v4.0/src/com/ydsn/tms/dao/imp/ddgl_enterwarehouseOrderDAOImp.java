package com.ydsn.tms.dao.imp;
import java.util.List;
import org.apache.log4j.Logger;
import com.ydsn.tms.dao.BaseDAO;
import com.ydsn.tms.dao.ddgl_enterwarehouseOrderDAO;
import com.ydsn.tms.po.ddgl_enterwarehouseOrder;

public class ddgl_enterwarehouseOrderDAOImp extends BaseDAO<ddgl_enterwarehouseOrder> implements ddgl_enterwarehouseOrderDAO{
	Logger logger=Logger.getLogger(ddgl_enterwarehouseOrderDAOImp.class);
	@Override
	public void add(ddgl_enterwarehouseOrder ent) {
		logger.warn("=====addDAO excuted success!!=======");
		super.add(ent);
		
	}
	@Override
	public void update(ddgl_enterwarehouseOrder ent) {
		super.update(ent);
		
	}
	@Override
	public void delete(String rkdd_bill) {
		super.deleteById(ddgl_enterwarehouseOrder.class,rkdd_bill);
		
	}
	
	@Override
	public List<Object[]> findNameById(String rkdd_bill) {
		String sql="select *from enterwarehouseOrder ent where ent.rkdd_bill='"+rkdd_bill+"'";
		return super.findById(sql);
	}
	
	public List<Object[]> findIdByBill(String khdd_bill) {
		String sql="select *from enterwarehouseOrder ent where ent.khdd_bill='"+khdd_bill+"'";
		return super.findByName(sql);
	}
	
	public List<ddgl_enterwarehouseOrder> findAllBill() {
		String hql="from ddgl_enterwarehouseOrder";
		return super.findAll(hql);
	}

}











