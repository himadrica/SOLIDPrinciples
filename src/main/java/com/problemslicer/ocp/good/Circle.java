package com.problemslicer.ocp.good;

public class Circle implements Shape {
	private double radius;

	@Override
	public double calculateArea() {
		return (22 / 7) * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

}
