package com.ydsn.tms.po;

/**
 *�ڲ���������ģ�顪��������λʵ��  
 *@author  ���
 *2015��6��15�� ����2:21:37
 */
public class nbchrkgl_huowuyiwei {
	 private String hwyw_bill;                    /**������λ���**/
	 private String hwychhw_id;                   /**�����Ƴ���λID**/
	 private String hwyrhw_id;                    /**���������λID**/
	 private String hwywshp_id;                   /**������λ��ƷID**/
	 private String hwywck_id;                    /**������λ�ֿ�ID**/
	 private String hwyw_num;                     /**������λ���κ�**/
	 private String hwywbzhgg;                    /**������λ��װ���**/
	 private String hwyw_amount;                  /**������λ����**/
	 private String hwyw_reason;                   /**������λԭ��**/
	public String getHwyw_bill() {
		return hwyw_bill;
	}
	public void setHwyw_bill(String hwyw_bill) {
		this.hwyw_bill = hwyw_bill;
	}
	public String getHwychhw_id() {
		return hwychhw_id;
	}
	public void setHwychhw_id(String hwychhw_id) {
		this.hwychhw_id = hwychhw_id;
	}
	public String getHwyrhw_id() {
		return hwyrhw_id;
	}
	public void setHwyrhw_id(String hwyrhw_id) {
		this.hwyrhw_id = hwyrhw_id;
	}
	public String getHwywshp_id() {
		return hwywshp_id;
	}
	public void setHwywshp_id(String hwywshp_id) {
		this.hwywshp_id = hwywshp_id;
	}
	public String getHwywck_id() {
		return hwywck_id;
	}
	public void setHwywck_id(String hwywck_id) {
		this.hwywck_id = hwywck_id;
	}
	public String getHwyw_num() {
		return hwyw_num;
	}
	public void setHwyw_num(String hwyw_num) {
		this.hwyw_num = hwyw_num;
	}
	public String getHwywbzhgg() {
		return hwywbzhgg;
	}
	public void setHwywbzhgg(String hwywbzhgg) {
		this.hwywbzhgg = hwywbzhgg;
	}
	public String getHwyw_amount() {
		return hwyw_amount;
	}
	public void setHwyw_amount(String hwyw_amount) {
		this.hwyw_amount = hwyw_amount;
	}
	public String getHwyw_reason() {
		return hwyw_reason;
	}
	public void setHwyw_reason(String hwyw_reason) {
		this.hwyw_reason = hwyw_reason;
	}
	public nbchrkgl_huowuyiwei() {
	}
	public nbchrkgl_huowuyiwei(String hwyw_bill, String hwychhw_id,
			String hwyrhw_id, String hwywshp_id, String hwywck_id,
			String hwyw_num, String hwywbzhgg, String hwyw_amount,
			String hwyw_reason) {
		this.hwyw_bill = hwyw_bill;
		this.hwychhw_id = hwychhw_id;
		this.hwyrhw_id = hwyrhw_id;
		this.hwywshp_id = hwywshp_id;
		this.hwywck_id = hwywck_id;
		this.hwyw_num = hwyw_num;
		this.hwywbzhgg = hwywbzhgg;
		this.hwyw_amount = hwyw_amount;
		this.hwyw_reason = hwyw_reason;
	}
	 
}
