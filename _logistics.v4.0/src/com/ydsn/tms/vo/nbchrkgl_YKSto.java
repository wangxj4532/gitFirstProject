package com.ydsn.tms.vo;

/**
 * �ڲ���������ģ�顪�������ƿ�VO
 *@author  ���
 *2015��6��14�� ����8:29:57
 */
public class nbchrkgl_YKSto {
	  private String hwyk_bill;                      /**�����ƿ���**/
	  private String hwychk_bill;                    /**�����Ƴ�����**/
	  private String hwyrk_bill;                     /**�����������**/
	  private String hwykzhd_man;                    /**�����ƿ��Ƶ���**/
	  private String hwykzhd_time;                   /**�����ƿ��Ƶ�ʱ��**/
	  private String hwyk_remark;                    /**�����ƿⱸע**/
	  private String hwyrk_name;                      /**�������������**/
	  private String hwychk_name;                    /**�����Ƴ�������**/
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
