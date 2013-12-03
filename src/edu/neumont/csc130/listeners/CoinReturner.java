package edu.neumont.csc130.listeners;

import edu.neumont.csc130.SlotMachine;
import edu.neumont.csc130.eventHandling.ButtonEvent;
import edu.neumont.csc130.eventHandling.ButtonListener;

public class CoinReturner implements ButtonListener {

//	buttonPressed(EventObject event){
//		get the SlotMachine from the event
//		Tell the coinSlot to returnCoin();
//	}
	
	@Override
	public void buttonPressed(ButtonEvent event) {
		SlotMachine theMachine = (SlotMachine) event.getSource();
		theMachine.returnCoin();
	}
	
}
