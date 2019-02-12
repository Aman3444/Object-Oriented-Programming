public abstract class Vehicle {
	private int numWheels;
	protected double speed;

	public Vehicle (int wheels){
		this.numWheels=wheels;
	}
	
	/*
	 * Calling the constructor from the car class and bicycle 
	 * which is makeNoise()
	 * */
	 
	public abstract String makeNoise();
		/*
		 * Calling the constructor from the car class and bicycle 
		 * which is pushPedal()
		 * */

	public abstract void pushPedal();

	/*
	 * this retures the value of speed from car and bicycle  calss is dispalyed
	 * */
	public double getSpeed(){
		return speed;

	}
}