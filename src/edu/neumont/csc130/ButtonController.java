package edu.neumont.csc130;

import lejos.nxt.SensorPort;
import lejos.nxt.TouchSensor;

public class ButtonController {

	private TouchSensor manualActivatorButton = new TouchSensor(SensorPort.S2);
	private TouchSensor coinReturnButton = new TouchSensor(SensorPort.S3);
	
	public boolean manualActivatorPressed(){
		return manualActivatorButton.isPressed();
	}
	
	public boolean coinReturnButtonPressed(){
		return coinReturnButton.isPressed();
	}
}
