package edu.neumont.csc130;

import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;

public class CoinSlot {

//	NXTMotor motor
	private MotorController motor = new MotorController();
//	lightSensor sensor
	private LightSensor sensor = new LightSensor(SensorPort.S1);
	
	public void calibrateSensor(){
//		calibrate the sensor for when there is not a coin
		sensor.calibrateHigh();
	}
	

	public boolean hasCoin(){
//		return if the sensor detects a coin in the CoinSlot
		return (sensor.readValue() < sensor.getHigh());
	}

	public void ejectCoin(){
//		Set the motor’s power to ejectSpeed
//		tell the motor to turn backward
		motor.returnCoin();
	}
	
	public void eatCoin(){
//		Set the motor’s power to takeCoinSpeed
//		Tell the motor to turn forward
		motor.insertCoin();
	}
}
