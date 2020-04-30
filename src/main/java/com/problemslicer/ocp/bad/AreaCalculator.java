package com.problemslicer.ocp.bad;

/**
 * @author himadri
 * 
 * The code here violates the OCP principle.
 * 
 * Lets say we have a new shape Triangle. In that case, we will again end up modifying the AreaCalculator class. 
 * As the types of shapes grows this becomes messier as AreaCalculator keeps on changing.
 * 
 * Modification of above design to comply with opened/closed principle by creating a super class/interface shape and inject the
 * super type to area calculator to get the area. In that way if any new shape comes in to calculate their area just need to implement 
 * the class shape.
 */
public class AreaCalculator {
	
	public double calculateRectangleArea(Rectangle rectangle) {
		return rectangle.getWidth() * rectangle.getLenght();
	}
	
	public double calculateCircleArea(Circle circle) {
		return (22/7)*circle.getRadius();
	}
}
