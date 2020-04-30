package com.problemslicer.ocp.good;

/**
 * @author himadri
 *
 */
public class Rectangle implements Shape {
	
	private double width;
	private double length;

	@Override
	public double calculateArea() {
		return width * length;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}
}
