package com.ydsn.tms.vo;

/**
 * 出入库管理模块——入库订单明细VO
 *@author  孙军
 *2015年6月17日 下午8:12:36
 */
public class chrkgl_rukudanminxiVO {
	  private String rkhw_num;                        /**入库货物批次号**/
	  private String rkmx_bill;                       /**入库明细编号**/
	  private String rkd_id;                          /**入库单ID**/
	  private String rkhw;                            /**入库货位**/
	  private String shp_id;                          /**商品ID**/
	  private String rkmx_amount;                     /**出库明细数量**/
	  private String rkyxq;                           /**入库有效期**/
	  private String rkshch_date;                     /**入库生产日期**/
	  private String shp_name;                        /**商品名称**/
	public String getRkhw_num() {
		return rkhw_num;
	}
	public void setRkhw_num(String rkhw_num) {
		this.rkhw_num = rkhw_num;
	}
	public String getRkmx_bill() {
		return rkmx_bill;
	}
	public void setRkmx_bill(String rkmx_bill) {
		this.rkmx_bill = rkmx_bill;
	}
	public String getRkd_id() {
		return rkd_id;
	}
	public void setRkd_id(String rkd_id) {
		this.rkd_id = rkd_id;
	}
	public String getRkhw() {
		return rkhw;
	}
	public void setRkhw(String rkhw) {
		this.rkhw = rkhw;
	}
	public String getShp_id() {
		return shp_id;
	}
	public void setShp_id(String shp_id) {
		this.shp_id = shp_id;
	}
	public String getRkmx_amount() {
		return rkmx_amount;
	}
	public void setRkmx_amount(String rkmx_amount) {
		this.rkmx_amount = rkmx_amount;
	}
	public String getRkyxq() {
		return rkyxq;
	}
	public void setRkyxq(String rkyxq) {
		this.rkyxq = rkyxq;
	}
	public String getRkshch_date() {
		return rkshch_date;
	}
	public void setRkshch_date(String rkshch_date) {
		this.rkshch_date = rkshch_date;
	}
	public String getShp_name() {
		return shp_name;
	}
	public void setShp_name(String shp_name) {
		this.shp_name = shp_name;
	}
	public chrkgl_rukudanminxiVO() {
	}
	public chrkgl_rukudanminxiVO(String rkhw_num, String rkmx_bill,
			String rkd_id, String rkhw, String shp_id, String rkmx_amount,
			String rkyxq, String rkshch_date, String shp_name) {
		this.rkhw_num = rkhw_num;
		this.rkmx_bill = rkmx_bill;
		this.rkd_id = rkd_id;
		this.rkhw = rkhw;
		this.shp_id = shp_id;
		this.rkmx_amount = rkmx_amount;
		this.rkyxq = rkyxq;
		this.rkshch_date = rkshch_date;
		this.shp_name = shp_name;
	}
	  
}
