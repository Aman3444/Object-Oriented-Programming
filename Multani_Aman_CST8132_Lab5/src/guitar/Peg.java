package guitar;
public class Peg {
	Wire W;
	public Peg(Wire wire) {
	W=wire;	

	}
	public void turn(int deltaTension){
		W.changeTension(deltaTension);
	}
		
	}


