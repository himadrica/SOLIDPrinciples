package com.problemslicer.srp.bad;

import java.util.Date;


/**
 * @author himadri
 * 
 * This Employee class breaks the Single Responsibility Principle
 * There are two methods here that breaks the single responsibility principle
 * - performanceReport , HR is responsible for this
 * - calcIncomeTaxCurrentYear, Finance department is responsible here
 * 
 * These two method should not belong here. if we ask the employee class What 
 * is your responsibility?
 * we find three answers here  
 * - Employee information
 * - calculate performance report
 * - calculate income tax
 * 
 * we should re-factor the class and separate two methods to two different classes
 */
public class Employee {
	private String employeeId;
	private String name;
	private String address;
	private Date dateOfJoining;

	public String[] performanceReport() {
		System.out.println("Calculating performance report");
		return new String[1];
	}

	public Double calcIncomeTaxCurrentYear() {
		System.out.println("Calculating income tax ");
		return 90.00;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
