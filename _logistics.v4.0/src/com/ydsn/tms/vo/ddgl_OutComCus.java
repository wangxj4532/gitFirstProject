package com.ydsn.tms.vo;

/**
 * ��������ģ�顪�����ⶩ���Ϳͻ�����ƷVO 
 *@author  ���
 *2015��6��13�� ����9:15:19
 */
public class ddgl_OutComCus {
	  private String chkddshp_id;                   /**���ⶩ����ƷID**/
	  private String chkddkh_id;                    /**���ⶩ���ͻ�ID**/
	  private String chkdd_bill;                    /**���ⶩ�����**/
	  private String khchkdd_bill ;                 /**�ͻ����ⶩ�����**/
	  private String khdd_amount;                   /**�ͻ���������**/
	  private String dd_date;                       /**�µ�����**/
	  private String yjchk_date;                    /**Ԥ�Ƴ���ʱ��**/
	  private String chkorccphx;                    /**����OR�д�Ʒ������1,2��**/
	  private String chkddzht_status;               /**���ⶩ��״̬0Ԥ���⣬1�ѳ��⣬2��ȡ��**/
	  private String chkdd_man;                     /**���ⶩ����**/
	  private String chkddzhd_time;                 /**���ⶩ���Ƶ�ʱ��**/
	  private String g_name;                       /**��ⶩ����Ʒ����**/      
	  private String cus_name;                     /**��ⶩ���ͻ�����**/
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
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public ddgl_OutComCus() {
	}
	public ddgl_OutComCus(String chkddshp_id, String chkddkh_id,
			String chkdd_bill, String khchkdd_bill, String khdd_amount,
			String dd_date, String yjchk_date, String chkorccphx,
			String chkddzht_status, String chkdd_man, String chkddzhd_time,
			String g_name, String cus_name) {
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
		this.g_name = g_name;
		this.cus_name = cus_name;
	}
	  
}
