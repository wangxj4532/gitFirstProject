package com.ydsn.tms.po;

/**
 * 
 *@author  孙军
 *2015年6月12日 下午9:25:25
 */
public class ddgl_enterwarehouseOrder {
	  private String rkddshp_id;                   /**入库订单商品ID**/      
	  private String rkddkh_id;                    /**入库订单客户ID**/
	  private String rkdd_bill;                    /**入库订单编号**/
	  private String khdd_bill;                    /**客户订单编号**/
	  private String rk_amount;                    /**入库数量**/
	  private String rkorfprk;                     /**入库OR返品入库（1,2）**/
	  private String rkdd_status;                  /**入库订单状态0预入库，1已入库，2已取消**/
	  private String xd_date;                      /**下单日期**/
	  private String yjrk_date;                    /**预计入库时间**/
	  private String rkddzhd_man;                  /**入库订单制单人**/
	  private String rkddzhd_time;                 /**入库订单制单时间**/
	public String getRkddshp_id() {
		return rkddshp_id;
	}
	public void setRkddshp_id(String rkddshp_id) {
		this.rkddshp_id = rkddshp_id;
	}
	public String getRkddkh_id() {
		return rkddkh_id;
	}
	public void setRkddkh_id(String rkddkh_id) {
		this.rkddkh_id = rkddkh_id;
	}
	public String getRkdd_bill() {
		return rkdd_bill;
	}
	public void setRkdd_bill(String rkdd_bill) {
		this.rkdd_bill = rkdd_bill;
	}
	public String getKhdd_bill() {
		return khdd_bill;
	}
	public void setKhdd_bill(String khdd_bill) {
		this.khdd_bill = khdd_bill;
	}
	public String getRk_amount() {
		return rk_amount;
	}
	public void setRk_amount(String rk_amount) {
		this.rk_amount = rk_amount;
	}
	public String getRkorfprk() {
		return rkorfprk;
	}
	public void setRkorfprk(String rkorfprk) {
		this.rkorfprk = rkorfprk;
	}
	public String getRkdd_status() {
		return rkdd_status;
	}
	public void setRkdd_status(String rkdd_status) {
		this.rkdd_status = rkdd_status;
	}
	public String getXd_date() {
		return xd_date;
	}
	public void setXd_date(String xd_date) {
		this.xd_date = xd_date;
	}
	public String getYjrk_date() {
		return yjrk_date;
	}
	public void setYjrk_date(String yjrk_date) {
		this.yjrk_date = yjrk_date;
	}
	public String getRkddzhd_man() {
		return rkddzhd_man;
	}
	public void setRkddzhd_man(String rkddzhd_man) {
		this.rkddzhd_man = rkddzhd_man;
	}
	public String getRkddzhd_time() {
		return rkddzhd_time;
	}
	public void setRkddzhd_time(String rkddzhd_time) {
		this.rkddzhd_time = rkddzhd_time;
	}
	public ddgl_enterwarehouseOrder() {
	}
	public ddgl_enterwarehouseOrder(String rkddshp_id, String rkddkh_id,
			String rkdd_bill, String khdd_bill, String rk_amount,
			String rkorfprk, String rkdd_status, String xd_date,
			String yjrk_date, String rkddzhd_man, String rkddzhd_time) {
		this.rkddshp_id = rkddshp_id;
		this.rkddkh_id = rkddkh_id;
		this.rkdd_bill = rkdd_bill;
		this.khdd_bill = khdd_bill;
		this.rk_amount = rk_amount;
		this.rkorfprk = rkorfprk;
		this.rkdd_status = rkdd_status;
		this.xd_date = xd_date;
		this.yjrk_date = yjrk_date;
		this.rkddzhd_man = rkddzhd_man;
		this.rkddzhd_time = rkddzhd_time;
	}  
	  

}
