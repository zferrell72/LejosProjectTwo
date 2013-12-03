package edu.neumont.csc130;

import java.util.Random;

import edu.neumont.csc130.eventHandling.ButtonEvent;
import edu.neumont.csc130.listeners.CoinReturner;
import edu.neumont.csc130.listeners.ManualActivator;

public class SlotMachine {

	// create new coinSlot;
	private CoinSlot coinSlot = new CoinSlot();
	// create new manualActivator
	private ManualActivator manualActivator = new ManualActivator();
	// create new CoinReturn
	private CoinReturner coinReturner = new CoinReturner();
	// create new soundController;
	private SoundController soundController = new SoundController();
	// create new CoinLiberator;
	private CoinLiberator coinLiberator = new CoinLiberator();
	private ButtonController buttonController = new ButtonController();
	private DisplayController displayController = new DisplayController();
	// create new static random number generator
	public static Random numGenerator = new Random();
	public static final int MAXPOT = 4;
	public static final int EMPTYPOT = 0;
	// let coinsInPot be EmptyPot;
	private int coinsInPot = EMPTYPOT;
	// let randomNum be -1;
	private int randomNum = -1;

	public void startSlotMachine() {
		// while forever...
		while (true) {
			checkManualActivatorPressed();
			checkCoinReturnPressed();
		}
	}

	public synchronized void checkManualActivatorPressed() {
		// if the manual activator has been pressed,
		if (buttonController.manualActivatorPressed()) {
			// Create a new button event with the slotMachine as the source
			ButtonEvent theEvent = new ButtonEvent(this);
			// fire the manualActivator’s buttonPressed event
			manualActivator.buttonPressed(theEvent);
		}
	}

	public synchronized void checkCoinReturnPressed() {
		// if the coin return has been pressed
		if (buttonController.coinReturnButtonPressed()) {
			// Create a new button event with the slotMachine as the source
			ButtonEvent theEvent = new ButtonEvent(this);
			// fire the CoinReturn’s buttonPressed event
			coinReturner.buttonPressed(theEvent);
		}
	}

	public synchronized void startTurn() {
		// increase coinsInPot by 1;
		coinsInPot++;
		coinSlot.eatCoin();
		// if coinsInPot greater than MaxPot…
		if (coinsInPot > MAXPOT) {
			winOperation();
		}
		// else if coinsInPot less than or equal to MaxPot
		else {
			gamble();
		}
	}

	public synchronized void gamble() {
		// generate randomNum between 0-9
		int randomNum = numGenerator.nextInt(10);
		System.out.println(randomNum);
		// if randomNum is 0 or 9…
		if (randomNum == 0 || randomNum == 9) {
			winOperation();
		}
		// else if randomNum is not 0 or 9…
		else {
			loseOperation();
		}
	}

	public void loseOperation() {
		// have sound Controller play sadSound
		soundController.playSadSound();
	}

	public void winOperation() {
		// have CoinLiberator releaseCoins();
		coinLiberator.releaseCoins();
		// tell the sound controller to play fanfare
		soundController.playFanfare();
		// display “JackPot” and coinsInPot
		displayController.displayMessage("JackPot!!!");
		// let coinsInPot be EmptyPot;
		coinsInPot = EMPTYPOT;
	}

	public void returnCoin() {
		// tell the CoinSlot to return the coin
		coinSlot.ejectCoin();
	}

}
