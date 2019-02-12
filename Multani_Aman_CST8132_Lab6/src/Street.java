/*
 * Author : Aman Multani 
 * 040877727
 * 
 */


import java.util.Random;

public class Street {
	private static final Random randomNumbers = new Random();
	private Vehicle[] vehicles;

	public Street(){
		 /* My constructor code to create and      
		  *       initialize  vehicles array */ 
		vehicles=new Vehicle[4];
		vehicles[0]=new Car();
		vehicles[1]=new Bicycle();
		vehicles[2]=new Car();
		vehicles[3]=new Bicycle();
	}

	public void simulate(){
		System.out.println("Update on the street:");

		for (int i = 0 ; i < 6 ; i++) {
			
			/* this is my loop for  simulation */ 
			
			System.out.println(vehicles[0].toString() +" has speed "+vehicles[0].getSpeed());
			System.out.println(vehicles[1].toString() +" has speed "+vehicles[1].getSpeed());
			System.out.println(vehicles[2].toString() +" has speed "+vehicles[2].getSpeed());
			System.out.println(vehicles[3].toString() +" has speed "+vehicles[3].getSpeed());
			System.out.println(vehicles[0].toString() +":" + vehicles[0].makeNoise());
			System.out.println(vehicles[1].toString() +":" + vehicles[1].makeNoise());
			System.out.println(vehicles[2].toString() +":" + vehicles[2].makeNoise());
			System.out.println(vehicles[3].toString() +":" + vehicles[3].makeNoise());

			vehicles[randomNumbers.nextInt(4)].pushPedal();
			System.out.println("The pedal of "+vehicles[randomNumbers.nextInt(4)]+" was pushed");
			System.out.println();}
	}
	public static void main (String[] args) {
		Street thestreet = new Street();
		thestreet.simulate();
	}
}