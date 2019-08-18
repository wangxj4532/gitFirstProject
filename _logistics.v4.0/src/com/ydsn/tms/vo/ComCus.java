package com.ydsn.tms.vo;

import java.io.Serializable;

/**
 *基础信息 -商品和客户信息
 * 
 *@author  孙军
 *2015年6月5日 上午11:24:34
 */
@SuppressWarnings("serial")
public class ComCus  implements Serializable{
    private String cus_name; 
    private String g_id;
    private String cus_num;
    private String g_class;
    private String g_bill;
    private String g_name;
    private String g_unit;
    private String g_weight;
    private String g_length;
    private String g_width;
    private String g_height;
    private String g_packamount;
    private String g_standard;
    private String g_price;
    private String g_packunit;
    private String g_packweight;
    private String g_packlength;
    private String g_packwidth;
    private String g_packheight;
    private String g_serial;
    private String g_remarks;
    private String g_time;
    private String g_value;
	public String getCus_name() {
		return cus_name;
	}
	public void setCus_name(String cus_name) {
		this.cus_name = cus_name;
	}
	public String getG_id() {
		return g_id;
	}
	public void setG_id(String g_id) {
		this.g_id = g_id;
	}
	public String getCus_num() {
		return cus_num;
	}
	public void setCus_num(String cus_num) {
		this.cus_num = cus_num;
	}
	public String getG_class() {
		return g_class;
	}
	public void setG_class(String g_class) {
		this.g_class = g_class;
	}
	public String getG_bill() {
		return g_bill;
	}
	public void setG_bill(String g_bill) {
		this.g_bill = g_bill;
	}
	public String getG_name() {
		return g_name;
	}
	public void setG_name(String g_name) {
		this.g_name = g_name;
	}
	public String getG_unit() {
		return g_unit;
	}
	public void setG_unit(String g_unit) {
		this.g_unit = g_unit;
	}
	public String getG_weight() {
		return g_weight;
	}
	public void setG_weight(String g_weight) {
		this.g_weight = g_weight;
	}
	public String getG_length() {
		return g_length;
	}
	public void setG_length(String g_length) {
		this.g_length = g_length;
	}
	public String getG_width() {
		return g_width;
	}
	public void setG_width(String g_width) {
		this.g_width = g_width;
	}
	public String getG_height() {
		return g_height;
	}
	public void setG_height(String g_height) {
		this.g_height = g_height;
	}
	public String getG_packamount() {
		return g_packamount;
	}
	public void setG_packamount(String g_packamount) {
		this.g_packamount = g_packamount;
	}
	public String getG_standard() {
		return g_standard;
	}
	public void setG_standard(String g_standard) {
		this.g_standard = g_standard;
	}
	public String getG_price() {
		return g_price;
	}
	public void setG_price(String g_price) {
		this.g_price = g_price;
	}
	public String getG_packunit() {
		return g_packunit;
	}
	public void setG_packunit(String g_packunit) {
		this.g_packunit = g_packunit;
	}
	public String getG_packweight() {
		return g_packweight;
	}
	public void setG_packweight(String g_packweight) {
		this.g_packweight = g_packweight;
	}
	public String getG_packlength() {
		return g_packlength;
	}
	public void setG_packlength(String g_packlength) {
		this.g_packlength = g_packlength;
	}
	public String getG_packwidth() {
		return g_packwidth;
	}
	public void setG_packwidth(String g_packwidth) {
		this.g_packwidth = g_packwidth;
	}
	public String getG_packheight() {
		return g_packheight;
	}
	public void setG_packheight(String g_packheight) {
		this.g_packheight = g_packheight;
	}
	public String getG_serial() {
		return g_serial;
	}
	public void setG_serial(String g_serial) {
		this.g_serial = g_serial;
	}
	public String getG_remarks() {
		return g_remarks;
	}
	public void setG_remarks(String g_remarks) {
		this.g_remarks = g_remarks;
	}
	public String getG_time() {
		return g_time;
	}
	public void setG_time(String g_time) {
		this.g_time = g_time;
	}
	public String getG_value() {
		return g_value;
	}
	public void setG_value(String g_value) {
		this.g_value = g_value;
	}
	public ComCus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ComCus(String cus_name, String g_id, String cus_num, String g_class,
			String g_bill, String g_name, String g_unit, String g_weight,
			String g_length, String g_width, String g_height,
			String g_packamount, String g_standard, String g_price,
			String g_packunit, String g_packweight, String g_packlength,
			String g_packwidth, String g_packheight, String g_serial,
			String g_remarks, String g_time, String g_value) {
		super();
		this.cus_name = cus_name;
		this.g_id = g_id;
		this.cus_num = cus_num;
		this.g_class = g_class;
		this.g_bill = g_bill;
		this.g_name = g_name;
		this.g_unit = g_unit;
		this.g_weight = g_weight;
		this.g_length = g_length;
		this.g_width = g_width;
		this.g_height = g_height;
		this.g_packamount = g_packamount;
		this.g_standard = g_standard;
		this.g_price = g_price;
		this.g_packunit = g_packunit;
		this.g_packweight = g_packweight;
		this.g_packlength = g_packlength;
		this.g_packwidth = g_packwidth;
		this.g_packheight = g_packheight;
		this.g_serial = g_serial;
		this.g_remarks = g_remarks;
		this.g_time = g_time;
		this.g_value = g_value;
	}
	 
}  
