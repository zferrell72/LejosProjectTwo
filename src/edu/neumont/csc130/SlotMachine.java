package edu.neumont.csc130;

public class SlotMachine {

	
//	create new coinSlot;
//	create new manualActivator
//	create new CoinReturn
//	create new soundController;
//	create new CoinLiberator;
//	create new static random number generator
//  static final int MaxPot = 4
//  static final int EmptyPot = 0
//	let coinsInPot be EmptyPot;
//	let randomNum be -1;
//
//	     StartSlotMachine{
//	while forever...
//		checkManualActivatorPressed()
//		checkCoinReturnPressed()
//	     }
//
//	 synchronized   checkManualActivatorPressed(){
//	        	Create a new button event with the slotMachine as the source
//	if the manual activator has been pressed,
//			fire the manualActivator’s buttonPressed event
//	    }
//
//
//	synchronized checkCoinReturnPressed(){
//	        Create a new button event with the slotMachine as the source
//		if the coin return has been pressed
//			fire the CoinReturn’s buttonPressed event
//	    }
//
//		
//
//	startTurn(){
//	increase coinsInPot by 1;
//	if coinsInPot greater than MaxPot…
//		winOperation();
//
//	else if coinsInPot less than or equal to MaxPot
//	gamble()
//	}
//		
//		public void gamble{
//		
//	generate randomNum between 0-9
//	if randomNum is 0 or 9…
//	winOperation();
//	else if randomNum is not 0 or 9…
//		loseOperation();
//		
//		}
//		
//	loseOperation(){
//			have sound Controller play sadSound
//	}
//
//
//	winOperation(){
//			have CoinLiberator  releaseCoins();
//		tell the sound controller to play fanfare
//		display “JackPot” and coinsInPot
//			let coinsInPot be EmptyPot;
//		}
//
//
//	returnCoin(){
//      tell the CoinSlot to return the coin
//  }

}
