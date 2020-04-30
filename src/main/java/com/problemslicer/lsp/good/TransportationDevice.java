package com.problemslicer.lsp.good;

/**
 * @author himadri
 * 
 *  The solution to these problems is a correct inheritance hierarchy
 */
abstract class TransportationDevice {
	private String name;
	private double speed;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

}