
public class Bicycle extends Vehicle{

	public Bicycle() {
		/*
		 * intialize the variable and its value 
		 * also the @param
		 *  */
		super(2);
		speed=0;
	}

	@Override
	/*
	 * making a constuctor and returning the string values
	 * for two conditions by using the if statement 
	 * */
	public String makeNoise() {
		if (speed==0){
			return  "sigh";
		}else
			return "grunt";
		}
		

	@Override
	/*using the conditions and 
	 * increasing the  speed by  4
	 * 
	 * */
	public void pushPedal() {
		if (speed<40){
			speed=speed +4;
		}
	}

}