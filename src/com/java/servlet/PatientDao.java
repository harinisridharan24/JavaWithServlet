/**
 * 
 */
package com.java.servlet;

import java.sql.*;
import java.util.*;

import com.mysql.cj.xdevapi.Statement;

/**
 * @author harini kumar
 *
 */
public class PatientDao {
	
	public static Connection getConnection() {
		Connection con = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/java_project", "root", "Anjaneyar24%");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}

	public static int save(Patient patient, Address address) {
		int status = 0;
		try {
			Connection con = PatientDao.getConnection();
			PreparedStatement ps1 = con.prepareStatement("insert into Address(street, city, state, zipcode) values (?,?,?,?)");
			ps1.setString(1, address.getStreet());
			ps1.setString(2, address.getCity());
			ps1.setString(3, address.getState());
			ps1.setString(4, address.getZipcode());
		}
		return 0;
	}
	
	public static List<Patient> getAllPatients() {
		List<Patient> patientList = new ArrayList<Patient>();
		return patientList;
	}
	
	public static Patient getPatientById(int id) {
		Patient patient = new Patient();
		return patient;
	}
	
	public static int delete(int id) {
		return 0;
	}
	
	public static int update(Patient patient) {
		return 0;
	}
}
