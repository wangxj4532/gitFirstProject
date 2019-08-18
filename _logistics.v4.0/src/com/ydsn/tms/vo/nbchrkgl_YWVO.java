package com.ydsn.tms.vo;

/**
 * 内部出入库管理模块——货物移位VO
 *@author  孙军
 *2015年6月15日 下午2:50:49
 */
public class nbchrkgl_YWVO {
	 private String hwyw_bill;                    /**货物移位编号**/
	 private String hwychhw_id;                   /**货物移出货位ID**/
	 private String hwyrhw_id;                    /**货物移入货位ID**/
	 private String hwywshp_id;                   /**货物移位商品ID**/
	 private String hwywck_id;                    /**货物移位仓库ID**/
	 private String hwyw_num;                     /**货物移位批次号**/
	 private String hwywbzhgg;                    /**货物移位包装规格**/
	 private String hwyw_amount;                  /**货物移位数量**/
	 private String hwyw_reason;                  /**货物移位原因**/
	 private String hwychhw_bill;                 /**货物移出货位**/
	 private String hwyrhw_bill;                  /**货物移入货位**/
	 private String hwywshp_name;                 /**货物移位商品名称**/
	 private String hwywck_name;                  /**货物移位仓库名称**/
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
	public String getHwychhw_bill() {
		return hwychhw_bill;
	}
	public void setHwychhw_bill(String hwychhw_bill) {
		this.hwychhw_bill = hwychhw_bill;
	}
	public String getHwyrhw_bill() {
		return hwyrhw_bill;
	}
	public void setHwyrhw_bill(String hwyrhw_bill) {
		this.hwyrhw_bill = hwyrhw_bill;
	}
	public String getHwywshp_name() {
		return hwywshp_name;
	}
	public void setHwywshp_name(String hwywshp_name) {
		this.hwywshp_name = hwywshp_name;
	}
	public String getHwywck_name() {
		return hwywck_name;
	}
	public void setHwywck_name(String hwywck_name) {
		this.hwywck_name = hwywck_name;
	}
	public nbchrkgl_YWVO() {
	}
	public nbchrkgl_YWVO(String hwyw_bill, String hwychhw_id, String hwyrhw_id,
			String hwywshp_id, String hwywck_id, String hwyw_num,
			String hwywbzhgg, String hwyw_amount, String hwyw_reason,
			String hwychhw_bill, String hwyrhw_bill, String hwywshp_name,
			String hwywck_name) {
		this.hwyw_bill = hwyw_bill;
		this.hwychhw_id = hwychhw_id;
		this.hwyrhw_id = hwyrhw_id;
		this.hwywshp_id = hwywshp_id;
		this.hwywck_id = hwywck_id;
		this.hwyw_num = hwyw_num;
		this.hwywbzhgg = hwywbzhgg;
		this.hwyw_amount = hwyw_amount;
		this.hwyw_reason = hwyw_reason;
		this.hwychhw_bill = hwychhw_bill;
		this.hwyrhw_bill = hwyrhw_bill;
		this.hwywshp_name = hwywshp_name;
		this.hwywck_name = hwywck_name;
	}
	 
}
