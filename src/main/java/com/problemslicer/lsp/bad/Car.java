package com.problemslicer.lsp.bad;

/**
 * @author himadri
 * 
 * There is no problem in Car class, A car is definitely a transportation device, and here we can see that it
 * overrides the startEngine()  method of its superclass.
 */
public class Car extends TransportationDevice {

	@Override
	void startEngine() {
		getEngine().startEngine();
	}

}
