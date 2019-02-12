/**
 *bicycle class extends abstract class vehicle .
 * it is used to implement all method which are declare in abstract class
 
 *
 */
public class Bicycle extends Vehicle {
	/**
	 * Bicycle class has a constructor car use to initialize attribute numberOfWheels.
	 */

	public Bicycle(){
		numberOfWheels=2;
		speed=0;
	}
	/**
	 * overriding here. It is used to create different  sounds according to speed. 
	 */
	@Override
	public String makeNoise() {
		if(speed==0){
			return "sigh";
		}else{
			return "grunt";
		}

	}
	/**
	 *  overriding makenoise in this class used to update the speed 
	 */

	@Override
	public void pushingPedal() {
		if(speed<=40){
			speed+=4;
		}else{
			speed+=0;
		}

	}
	/**
	 *  mainly use to display the speed of Bicycle class
	 * 
	 */
	@Override
	public void display() {
		System.out.println(toString()+ " has speed "+ speed);

	}
	/**
	 *  use to display noise
	 */
	@Override
	public void displayNoise() {
		System.out.println(toString()+ " has noise "+ makeNoise());	

	}
	/**
	 *  It has string result variable.
	 */

	@Override
	public String a() {
		String result=toString();
		// TODO Auto-generated method stub
		return result;
	}

}
