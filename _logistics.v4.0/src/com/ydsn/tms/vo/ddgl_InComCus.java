package com.ydsn.tms.vo;

/**
 *��������ģ�顪����ⶩ���Ϳͻ�����ƷVO 
 *@author  ���
 *2015��6��12�� ����10:17:02
 */
public class ddgl_InComCus {
	  private String rkddshp_id;                   /**��ⶩ����ƷID**/      
	  private String rkddkh_id;                    /**��ⶩ���ͻ�ID**/
	  private String rkdd_bill;                    /**��ⶩ�����**/
	  private String khdd_bill;                    /**�ͻ��������**/
	  private String rk_amount;                    /**�������**/
	  private String rkorfprk;                     /**���OR��Ʒ��⣨1,2��**/
	  private String rkdd_status;                  /**��ⶩ��״̬0Ԥ��⣬1����⣬2��ȡ��**/
	  private String xd_date;                      /**�µ�����**/
	  private String yjrk_date;                    /**Ԥ�����ʱ��**/
	  private String rkddzhd_man;                  /**��ⶩ���Ƶ���**/
	  private String rkddzhd_time;                 /**��ⶩ���Ƶ�ʱ��**/
	  private String g_name;                       /**��ⶩ����Ʒ����**/      
	  private String cus_name;                     /**��ⶩ���ͻ�����**/
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
	public ddgl_InComCus() {
	}
	public ddgl_InComCus(String rkddshp_id, String rkddkh_id, String rkdd_bill,
			String khdd_bill, String rk_amount, String rkorfprk,
			String rkdd_status, String xd_date, String yjrk_date,
			String rkddzhd_man, String rkddzhd_time, String g_name,
			String cus_name) {
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
		this.g_name = g_name;
		this.cus_name = cus_name;
	}
	  
	  
}
