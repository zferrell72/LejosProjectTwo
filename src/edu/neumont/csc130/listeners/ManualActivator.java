package edu.neumont.csc130.listeners;

import edu.neumont.csc130.SlotMachine;
import edu.neumont.csc130.eventHandling.ButtonEvent;
import edu.neumont.csc130.eventHandling.ButtonListener;

public class ManualActivator implements ButtonListener {

//	buttonPressed(EventObject event){
//		get the SlotMachine from the event
//		tell the slot machine to startTurn();
//	}
	
	@Override
	public void buttonPressed(ButtonEvent event) {
		SlotMachine theMachine = (SlotMachine) event.getSource();
		theMachine.startTurn();
	}
}
