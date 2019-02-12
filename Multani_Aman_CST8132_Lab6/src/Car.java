public class Car extends Vehicle{

	public Car() {
		/*
		 * intialize the variable and its value 
		 * also the @param
		 *  */
		super(4);
		speed=0;
	}

	@Override
	/*
	 * making a constuctor and returning the string values
	 * for two conditions by using the if statement 
	 * */
	public String makeNoise() {
		if (speed==0){
			return  "purr";
		}else
			return "vroom";
		}
		

	@Override
	/*
	 * increment of speed by  10
	 * 
	 * */
	public void pushPedal() {
		speed =speed +10;
	}

}