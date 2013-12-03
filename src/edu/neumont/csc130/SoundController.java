package edu.neumont.csc130;

public class SoundController {

public void playFanfare(){
		
		// A, Bb, B and C in that order
		Sound.playTone(A, SHORT_DUR);
		try {
			Thread.sleep(SHORT_DUR);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sound.playTone(Bb, SHORT_DUR);
		try {
			Thread.sleep(SHORT_DUR);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sound.playTone(B, MEDIUM_DUR);
		try {
			Thread.sleep(MEDIUM_DUR);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sound.playTone(C, LONG_DUR);
		try {
			Thread.sleep(LONG_DUR);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
//
//	playSadSound{
//		make lower tone sounds
//	}
	
	public void playSadSound(){
		
		Sound.playTone(C, LONG_DUR);
		try {
			Thread.sleep(LONG_DUR);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sound.playTone(B, MEDIUM_DUR);
		try {
			Thread.sleep(MEDIUM_DUR);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sound.playTone(Bb, SHORT_DUR);
		try {
			Thread.sleep(SHORT_DUR);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Sound.playTone(A, SHORT_DUR);
		try {
			Thread.sleep(SHORT_DUR);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
