package edu.neumont.csc130;

import lejos.nxt.MotorPort;
import lejos.nxt.NXTMotor;

public class MotorController {

	private NXTMotor coinSlotMotor;
	private NXTMotor doorMotor;
	private final int insertPower = 40;
	private final int returnPower = 100;
	private final int doorPower = 20;

	public MotorController() {
		coinSlotMotor = new NXTMotor(MotorPort.A);
		doorMotor = new NXTMotor(MotorPort.B);
	}

	public void insertCoin() {
		coinSlotMotor.setPower(insertPower);
		coinSlotMotor.forward();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		coinSlotMotor.stop();
	}

	public void returnCoin() {
		coinSlotMotor.setPower(returnPower);
		coinSlotMotor.backward();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		coinSlotMotor.stop();
	}

	public void releaseCoins() {
		doorMotor.setPower(doorPower);
		doorMotor.backward();
		try {
			Thread.sleep(1000);
			doorMotor.forward();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		doorMotor.stop();
	}
}
