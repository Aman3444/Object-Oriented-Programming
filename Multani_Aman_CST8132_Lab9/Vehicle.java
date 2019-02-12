/** *bicycle class extends abstract class vehicle .
 * it is used to implement all method which are declare in abstract class
 
 */
public  abstract class  Vehicle {
	protected double numberOfWheels;
	protected double speed;
	
	public double getSpeed(){
		return speed;
	}
	/**
	 * it has abstract makeNoise which is used to produce a noise.
	 * @return
	 */
	public abstract String makeNoise();
	/**
	 * it has method pushingPedal used to increase the speed of vehicle .   
	 */

	public abstract void pushingPedal();
	
	public abstract String a();
	
	public abstract void display();
	/**
	 * Display Noise is used to display noise
	 */
	public abstract void displayNoise();

}
