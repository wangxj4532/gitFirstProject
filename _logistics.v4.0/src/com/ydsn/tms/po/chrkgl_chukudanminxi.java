package com.ydsn.tms.po;

/**
 * ��������ģ�顪�����ⵥ��ϸʵ��
 *@author  ���
 *2015��6��17�� ����9:58:59
 */
public class chrkgl_chukudanminxi {
	  private String chkhw_num;                     /**����������κ�**/
	  private String chkmx_bill;                    /**������ϸ���**/
	  private String chkmxchkd_id;                  /**������ϸ������ID**/
	  private String chkhw;                         /**�����λ**/
	  private String chkmxshp_id;                   /**������ϸ��ƷID**/
	  private String chkmx_amount;                  /**������ϸ����**/
	  private String chkyxq;                        /**������Ч��**/
	  private String chkshch_date;                   /**������������**/
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
