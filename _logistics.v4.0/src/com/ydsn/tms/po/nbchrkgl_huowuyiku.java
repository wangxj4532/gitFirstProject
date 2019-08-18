package com.ydsn.tms.po;

/**
 *内部出入库管理模块——货物移库实体 
 *@author  孙军
 *2015年6月14日 下午8:31:34
 */
public class nbchrkgl_huowuyiku {
	  private String hwyk_bill;                      /**货物移库编号**/
	  private String hwychk_bill;                    /**货物移出库编号**/
	  private String hwyrk_bill;                     /**货物移入库编号**/
	  private String hwykzhd_man;                    /**货物移库制单人**/
	  private String hwykzhd_time;                   /**货物移库制单时间**/
	  private String hwyk_remark;                    /**货物移库备注**/
	public String getHwyk_bill() {
		return hwyk_bill;
	}
	public void setHwyk_bill(String hwyk_bill) {
		this.hwyk_bill = hwyk_bill;
	}
	public String getHwychk_bill() {
		return hwychk_bill;
	}
	public void setHwychk_bill(String hwychk_bill) {
		this.hwychk_bill = hwychk_bill;
	}
	public String getHwyrk_bill() {
		return hwyrk_bill;
	}
	public void setHwyrk_bill(String hwyrk_bill) {
		this.hwyrk_bill = hwyrk_bill;
	}
	public String getHwykzhd_man() {
		return hwykzhd_man;
	}
	public void setHwykzhd_man(String hwykzhd_man) {
		this.hwykzhd_man = hwykzhd_man;
	}
	public String getHwykzhd_time() {
		return hwykzhd_time;
	}
	public void setHwykzhd_time(String hwykzhd_time) {
		this.hwykzhd_time = hwykzhd_time;
	}
	public String getHwyk_remark() {
		return hwyk_remark;
	}
	public void setHwyk_remark(String hwyk_remark) {
		this.hwyk_remark = hwyk_remark;
	}
	public nbchrkgl_huowuyiku() {
	}
	public nbchrkgl_huowuyiku(String hwyk_bill, String hwychk_bill,
			String hwyrk_bill, String hwykzhd_man, String hwykzhd_time,
			String hwyk_remark) {
		this.hwyk_bill = hwyk_bill;
		this.hwychk_bill = hwychk_bill;
		this.hwyrk_bill = hwyrk_bill;
		this.hwykzhd_man = hwykzhd_man;
		this.hwykzhd_time = hwykzhd_time;
		this.hwyk_remark = hwyk_remark;
	}
	  
	  
}
