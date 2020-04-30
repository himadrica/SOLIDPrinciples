package com.problemslicer.dip.good;

/**
 * @author himadri
 * 
 * In both the Developer and Architect classes that we wrote, we implemented the Employee 
 * interface to provide their own functionality for assigning work.
 * 
 * Manager class is no more depend on a certain type of developer. 
 * It is now depend on the abstraction
 */
public class Manager {

	private Employee employee;

	public Manager(Employee employee) {
		super();
		this.employee = employee;
	}

	public void manageMyTeamWork() {
		employee.assignedWork();
	}
}
