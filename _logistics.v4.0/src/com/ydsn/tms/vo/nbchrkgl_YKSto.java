package com.ydsn.tms.vo;

/**
 * 内部出入库管理模块——货物移库VO
 *@author  孙军
 *2015年6月14日 下午8:29:57
 */
public class nbchrkgl_YKSto {
	  private String hwyk_bill;                      /**货物移库编号**/
	  private String hwychk_bill;                    /**货物移出库编号**/
	  private String hwyrk_bill;                     /**货物移入库编号**/
	  private String hwykzhd_man;                    /**货物移库制单人**/
	  private String hwykzhd_time;                   /**货物移库制单时间**/
	  private String hwyk_remark;                    /**货物移库备注**/
	  private String hwyrk_name;                      /**货物移入库名称**/
	  private String hwychk_name;                    /**货物移出库名称**/
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
	public String getHwyrk_name() {
		return hwyrk_name;
	}
	public void setHwyrk_name(String hwyrk_name) {
		this.hwyrk_name = hwyrk_name;
	}
	public String getHwychk_name() {
		return hwychk_name;
	}
	public void setHwychk_name(String hwychk_name) {
		this.hwychk_name = hwychk_name;
	}
	public nbchrkgl_YKSto() {
	}
	public nbchrkgl_YKSto(String hwyk_bill, String hwychk_bill,
			String hwyrk_bill, String hwykzhd_man, String hwykzhd_time,
			String hwyk_remark, String hwyrk_name, String hwychk_name) {
		this.hwyk_bill = hwyk_bill;
		this.hwychk_bill = hwychk_bill;
		this.hwyrk_bill = hwyrk_bill;
		this.hwykzhd_man = hwykzhd_man;
		this.hwykzhd_time = hwykzhd_time;
		this.hwyk_remark = hwyk_remark;
		this.hwyrk_name = hwyrk_name;
		this.hwychk_name = hwychk_name;
	}
	
}
