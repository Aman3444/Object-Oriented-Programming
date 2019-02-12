
public class Wire {
	int midiNote;
	Board Board;
	
	public Wire(Board sound,int midiNote){
		this.midiNote=midiNote;
		this.Board=sound;
		
	}
	public void changeTension(int deltaTension)
	{
		midiNote+=deltaTension;
	}
	public void vibrate(){
		Board.soundNote(midiNote);
		
	}
	
	

}
