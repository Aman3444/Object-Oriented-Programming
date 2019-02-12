package guitar;
public class Wire {
	int fret;
	
	private int tension;
	
	public void  tension(int fretNum){
		tension+= fretNum ;
	}
	public Wire(int tension){
		this.tension=tension;
		
		
	}
	public void changeTension(int deltaTension)
	{
		tension +=deltaTension;
	}
	public void vibrate(){
		Board.getInstance().soundNote(tension);
		
	}
	public void fret(int fretNum){
		tension = tension +fretNum;
		if(fretNum>=0)
			fret=fretNum;
	}
	

}
