package com.problemslicer.lsp.good;

import com.problemslicer.lsp.bad.Engine;

public abstract class DevicesWithEngines extends TransportationDevice {
	Engine engine;

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	abstract void startEngine();
}
