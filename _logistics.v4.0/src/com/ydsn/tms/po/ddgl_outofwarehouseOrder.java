package com.ydsn.tms.po;

/**
 * 
 *@author  孙军
 *2015年6月12日 下午9:20:58
 */
public class ddgl_outofwarehouseOrder {
	  private String chkddshp_id;                   /**出库订单商品ID**/
	  private String chkddkh_id;                    /**出库订单客户ID**/
	  private String chkdd_bill;                    /**出库订单编号**/
	  private String khchkdd_bill ;                 /**客户出库订单编号**/
	  private String khdd_amount;                   /**客户订单数量**/
	  private String dd_date;                       /**下单日期**/
	  private String yjchk_date;                    /**预计出库时间**/
	  private String chkorccphx;                    /**出库OR残次品核销（1,2）**/
	  private String chkddzht_status;               /**出库订单状态0预出库，1已出库，2已取消**/
	  private String chkdd_man;                     /**出库订单人**/
	  private String chkddzhd_time;                 /**出库订单制单时间**/
	public String getChkddshp_id() {
		return chkddshp_id;
	}
	public void setChkddshp_id(String chkddshp_id) {
		this.chkddshp_id = chkddshp_id;
	}
	public String getChkddkh_id() {
		return chkddkh_id;
	}
	public void setChkddkh_id(String chkddkh_id) {
		this.chkddkh_id = chkddkh_id;
	}
	public String getChkdd_bill() {
		return chkdd_bill;
	}
	public void setChkdd_bill(String chkdd_bill) {
		this.chkdd_bill = chkdd_bill;
	}
	public String getKhchkdd_bill() {
		return khchkdd_bill;
	}
	public void setKhchkdd_bill(String khchkdd_bill) {
		this.khchkdd_bill = khchkdd_bill;
	}
	public String getKhdd_amount() {
		return khdd_amount;
	}
	public void setKhdd_amount(String khdd_amount) {
		this.khdd_amount = khdd_amount;
	}
	public String getDd_date() {
		return dd_date;
	}
	public void setDd_date(String dd_date) {
		this.dd_date = dd_date;
	}
	public String getYjchk_date() {
		return yjchk_date;
	}
	public void setYjchk_date(String yjchk_date) {
		this.yjchk_date = yjchk_date;
	}
	public String getChkorccphx() {
		return chkorccphx;
	}
	public void setChkorccphx(String chkorccphx) {
		this.chkorccphx = chkorccphx;
	}
	public String getChkddzht_status() {
		return chkddzht_status;
	}
	public void setChkddzht_status(String chkddzht_status) {
		this.chkddzht_status = chkddzht_status;
	}
	public String getChkdd_man() {
		return chkdd_man;
	}
	public void setChkdd_man(String chkdd_man) {
		this.chkdd_man = chkdd_man;
	}
	public String getChkddzhd_time() {
		return chkddzhd_time;
	}
	public void setChkddzhd_time(String chkddzhd_time) {
		this.chkddzhd_time = chkddzhd_time;
	}
	public ddgl_outofwarehouseOrder() {
	}
	public ddgl_outofwarehouseOrder(String chkddshp_id, String chkddkh_id,
			String chkdd_bill, String khchkdd_bill, String khdd_amount,
			String dd_date, String yjchk_date, String chkorccphx,
			String chkddzht_status, String chkdd_man, String chkddzhd_time) {
		this.chkddshp_id = chkddshp_id;
		this.chkddkh_id = chkddkh_id;
		this.chkdd_bill = chkdd_bill;
		this.khchkdd_bill = khchkdd_bill;
		this.khdd_amount = khdd_amount;
		this.dd_date = dd_date;
		this.yjchk_date = yjchk_date;
		this.chkorccphx = chkorccphx;
		this.chkddzht_status = chkddzht_status;
		this.chkdd_man = chkdd_man;
		this.chkddzhd_time = chkddzhd_time;
	} 
	  
}
