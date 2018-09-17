/**
 * 
 */
package com.java.servlet;

/**
 * @author harini kumar
 *
 */
public class Address {
private int address_id;
private String street,city,state,zipcode;
/**
 * @return the address_id
 */
public int getAddress_id() {
	return address_id;
}
/**
 * @param address_id the address_id to set
 */
public void setAddress_id(int address_id) {
	this.address_id = address_id;
}
/**
 * @return the street
 */
public String getStreet() {
	return street;
}
/**
 * @param street the street to set
 */
public void setStreet(String street) {
	this.street = street;
}
/**
 * @return the city
 */
public String getCity() {
	return city;
}
/**
 * @param city the city to set
 */
public void setCity(String city) {
	this.city = city;
}
/**
 * @return the state
 */
public String getState() {
	return state;
}
/**
 * @param state the state to set
 */
public void setState(String state) {
	this.state = state;
}
/**
 * @return the zipcode
 */
public String getZipcode() {
	return zipcode;
}
/**
 * @param zipcode the zipcode to set
 */
public void setZipcode(String zipcode) {
	this.zipcode = zipcode;
}
}
