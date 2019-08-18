/**
 * 客户实体
 */
package com.ydsn.tms.po;

public class Customer {
   private String cus_id;
   private String cus_bill;
   private String cus_name;
   private String cus_shortname;
   private String cus_phone;
   private String cus_addr;
   private String cus_linkman;
   private String cus_email;
   private String cus_fax;
public String getCus_id() {
	return cus_id;
}
public void setCus_id(String cus_id) {
	this.cus_id = cus_id;
}
public String getCus_bill() {
	return cus_bill;
}
public void setCus_bill(String cus_bill) {
	this.cus_bill = cus_bill;
}
public String getCus_name() {
	return cus_name;
}
public void setCus_name(String cus_name) {
	this.cus_name = cus_name;
}
public String getCus_shortname() {
	return cus_shortname;
}
public void setCus_shortname(String cus_shortname) {
	this.cus_shortname = cus_shortname;
}
public String getCus_phone() {
	return cus_phone;
}
public void setCus_phone(String cus_phone) {
	this.cus_phone = cus_phone;
}
public String getCus_addr() {
	return cus_addr;
}
public void setCus_addr(String cus_addr) {
	this.cus_addr = cus_addr;
}
public String getCus_linkman() {
	return cus_linkman;
}
public void setCus_linkman(String cus_linkman) {
	this.cus_linkman = cus_linkman;
}
public String getCus_email() {
	return cus_email;
}
public void setCus_email(String cus_email) {
	this.cus_email = cus_email;
}
public String getCus_fax() {
	return cus_fax;
}
public void setCus_fax(String cus_fax) {
	this.cus_fax = cus_fax;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}
public Customer(String cus_id, String cus_bill, String cus_name,
		String cus_shortname, String cus_phone, String cus_addr,
		String cus_linkman, String cus_email, String cus_fax) {
	super();
	this.cus_id = cus_id;
	this.cus_bill = cus_bill;
	this.cus_name = cus_name;
	this.cus_shortname = cus_shortname;
	this.cus_phone = cus_phone;
	this.cus_addr = cus_addr;
	this.cus_linkman = cus_linkman;
	this.cus_email = cus_email;
	this.cus_fax = cus_fax;
}
   
   
}
