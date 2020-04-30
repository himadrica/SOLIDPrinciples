package com.problemslicer.lsp.good;

/**
 * @author himadri
 * 
 */
public class Car extends DevicesWithEngines {

	@Override
	void startEngine() {
		getEngine().startEngine();
	}

}
