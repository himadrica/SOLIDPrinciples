package com.problemslicer.lsp.bad;

/**
 * @author himadri
 * 
 * There is no problem in Car class, A car is definitely a transportation device, and here we can see that it
 * 
 * A bicycle is a transportation device, however, it does not have an engine and hence, the method startEngine() cannot be implemented
 * These are the kinds of problems that violation of Liskov Substitution Principle leads to, and they can most usually be recognized by 
 * a method that does nothing, or even can’t be implemented.
 * 
 * The solution to these problems is a correct inheritance hierarchy
 */
abstract class TransportationDevice {
	private String name;
	private double speed;
	private Engine engine;

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

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	abstract void startEngine();
}