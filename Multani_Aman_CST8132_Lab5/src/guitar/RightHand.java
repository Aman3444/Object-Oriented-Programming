package guitar;
public class RightHand implements GuitarPlayerRightHand {

	/*
	 * 	making	guitar	property	of	type	Guitar	
	 * */
	Guitar guitar;
	
	/*
	 * 	Guitar	property	will
	 * 	be	set	by	the	RightHand	constructor	(we	can	think	
	 * of	this	as	putting	the	guitar	in	the	right	hand).	
	 * */
	public RightHand(Guitar guitar) {
		this.guitar = guitar;
	}
	

	   /*
	    * Pluck the given wires simultaneously (pluck them one after the other
	    * not pausing between plucks)
	    * 
	    * */
	public void pluck(int... wires) {
		for(int i=0;i<wires.length;i++)
		{
			guitar.pluck(wires[i]);
		}
	}

	   /*
	    * Pluck all wires from 6 to 1, pausing 80 milliseconds between plucks
	    */
	public void strum() {
		for (int i = 6; i>0; i--){
			guitar.pluck(i);
			pause(80);
		}
		
	}
	/*
	    * Pluck all wires from Wire wireNum down to 1, pausing 80 milliseconds
	    * between plucks
	    */

	public void strum(int wireNum) {
		for (int i = wireNum; i>0; i--){
			guitar.pluck(i);
			pause(80);
		}
		
	}
	

	   /*
	    * Pause milliSeconds number of milliseconds  see SimpleSong.java for an implementation
	    * of this method that you can adapt.  That one takes a number of seconds as its
	    * parameter, but this one will take milliseconds as its parameter.
	    */
	public void pause(int milliSeconds) {
		try {
			Thread.sleep(milliSeconds );
		} catch (InterruptedException e) {
		}
	}
}



