package com.java.servlet;


public class Patient {
private int id;
private String name, insurance, mobile_no,email,password;
private Address address;
/**
 * @return the id
 */
public int getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the insurance
 */
public String getInsurance() {
	return insurance;
}
/**
 * @param insurance the insurance to set
 */
public void setInsurance(String insurance) {
	this.insurance = insurance;
}
/**
 * @return the mobile_no
 */
public String getMobile_no() {
	return mobile_no;
}
/**
 * @param mobile_no the mobile_no to set
 */
public void setMobile_no(String mobile_no) {
	this.mobile_no = mobile_no;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}
/**
 * @return the address
 */
public Address getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(Address address) {
	this.address = address;
}

}
