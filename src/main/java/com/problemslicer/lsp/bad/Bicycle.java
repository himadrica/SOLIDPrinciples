package com.problemslicer.lsp.bad;

/**
 * @author himadri
 * 
 * A bicycle is a transportation device, however, it does not have an engine and hence, the method startEngine() cannot be implemented
 * These are the kinds of problems that violation of Liskov Substitution Principle leads to, and they can most usually be recognized by 
 * a method that does nothing, or even can’t be implemented.
 */
public class Bicycle extends TransportationDevice {

	@Override
	void startEngine() {
		System.out.println("I don't have engine :-( ");
	}

}
