package edu.neumont.csc130.eventHandling;

import java.util.EventObject;

public class ButtonEvent {

	private Object source; 
	
	public ButtonEvent(Object source){
		this.source = source;
	}
	
	public Object getSource(){
		return this.source;
	}
}
