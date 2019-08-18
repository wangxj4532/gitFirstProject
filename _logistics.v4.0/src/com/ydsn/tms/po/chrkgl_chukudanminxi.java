package com.ydsn.tms.po;

/**
 * 出入库管理模块——出库单明细实体
 *@author  孙军
 *2015年6月17日 上午9:58:59
 */
public class chrkgl_chukudanminxi {
	  private String chkhw_num;                     /**出库货物批次号**/
	  private String chkmx_bill;                    /**出库明细编号**/
	  private String chkmxchkd_id;                  /**出库明细出货单ID**/
	  private String chkhw;                         /**出库货位**/
	  private String chkmxshp_id;                   /**出库明细商品ID**/
	  private String chkmx_amount;                  /**出库明细数量**/
	  private String chkyxq;                        /**出库有效期**/
	  private String chkshch_date;                   /**出库生产日期**/
	public String getChkhw_num() {
		return chkhw_num;
	}
	public void setChkhw_num(String chkhw_num) {
		this.chkhw_num = chkhw_num;
	}
	public String getChkmx_bill() {
		return chkmx_bill;
	}
	public void setChkmx_bill(String chkmx_bill) {
		this.chkmx_bill = chkmx_bill;
	}
	public String getChkmxchkd_id() {
		return chkmxchkd_id;
	}
	public void setChkmxchkd_id(String chkmxchkd_id) {
		this.chkmxchkd_id = chkmxchkd_id;
	}
	public String getChkhw() {
		return chkhw;
	}
	public void setChkhw(String chkhw) {
		this.chkhw = chkhw;
	}
	public String getChkmxshp_id() {
		return chkmxshp_id;
	}
	public void setChkmxshp_id(String chkmxshp_id) {
		this.chkmxshp_id = chkmxshp_id;
	}
	public String getChkmx_amount() {
		return chkmx_amount;
	}
	public void setChkmx_amount(String chkmx_amount) {
		this.chkmx_amount = chkmx_amount;
	}
	public String getChkyxq() {
		return chkyxq;
	}
	public void setChkyxq(String chkyxq) {
		this.chkyxq = chkyxq;
	}
	public String getChkshch_date() {
		return chkshch_date;
	}
	public void setChkshch_date(String chkshch_date) {
		this.chkshch_date = chkshch_date;
	}
	public chrkgl_chukudanminxi() {
	}
	public chrkgl_chukudanminxi(String chkhw_num, String chkmx_bill,
			String chkmxchkd_id, String chkhw, String chkmxshp_id,
			String chkmx_amount, String chkyxq, String chkshch_date) {
		this.chkhw_num = chkhw_num;
		this.chkmx_bill = chkmx_bill;
		this.chkmxchkd_id = chkmxchkd_id;
		this.chkhw = chkhw;
		this.chkmxshp_id = chkmxshp_id;
		this.chkmx_amount = chkmx_amount;
		this.chkyxq = chkyxq;
		this.chkshch_date = chkshch_date;
	}
	  
	  
}
