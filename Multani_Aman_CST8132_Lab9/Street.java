import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;

public class Street extends JFrame {

	
	FileOutputStream fileOut= null;	

	
	ObjectOutputStream objectOut= null; 

	String fileName = "vehicle.txt" ; 

	File file= new File (fileName);
	FileInputStream fileInput; 

	
	ObjectInputStream objectInput;

	private static final Random randomNumbers= new Random();
	private JPanel outputArea;
	private JTextField inputFile; 
	private JTextField outputField;
	private JButton addBicycle;; 
	private JButton addCar; 
	private JButton done;  
	private JButton addFile; 
	String name = "";
	VehicleComparator vehicleComparator = new VehicleComparator(); 
	private ArrayList<Vehicle> vehicles; 
	

	public Street(){

		super("Street Simulator");
		setLayout (new FlowLayout());
		outputArea= new JPanel();
		outputField = new JTextField(30);
		inputFile = new JTextField(30);
		outputField.setEditable(false);

		addFile = new JButton ("search File");
		vehicles =  new ArrayList<Vehicle>();
		outputArea = new JPanel();
		addBicycle = new JButton ("add Bicycle"); 
		addCar = new JButton ("add Car"); 
		done = new JButton ("done"); 



		addFile.addActionListener(

				new ActionListener(){

					public void actionPerformed( ActionEvent e){

						readFromFile(inputFile.getText());

					} // end of button
				}// end of actionListener

				);


	/**
	 *In here we are adding action listener with bicycle jbutton to perform action performed which is mainly use to creating  bicycle object again and again  when the user clicking add bicycle button and it 
	 * stores the object on the vehicles(arrayList variable).
	 */

		addBicycle.addActionListener(

				new ActionListener(){

					public void actionPerformed( ActionEvent e){

						vehicles.add(new Bicycle());// don't know... 
						int b = vehicles.size()-1;
						name = vehicles.get(b).toString();
						outputField.setText(name+" was added to the Street ");

					} 
				}

				);


		addCar.addActionListener(

				new ActionListener(){

					public void actionPerformed( ActionEvent e){

						vehicles.add(new Car());// don't know... 
						int c = vehicles.size()-1;
						name = vehicles.get(c).toString();
						outputField.setText(name+" was added to the Street ");

					} 
				}

				);
				/**
				 * In here we  are adding action listener with Done jbutton to perform action performed
				 *  which is mainly use to call simulate method when user clicks done button in the frame.
				 */

		done.addActionListener(

				new ActionListener(){

					public void actionPerformed( ActionEvent e){

						try{
							if (vehicles.isEmpty()){
								throw new IllegalArgumentException();
							}else{
								simulate();
								writeToFile();
							}
						}catch(IllegalArgumentException ex){
							System.err.println("Street cannot be empty. Please add something! ");
						}


					} 
				}

				);

		add(addBicycle);
		add(addCar);
		add(done);
		add(outputArea);
		add(outputField);
		add(inputFile);
		add(addFile);



	} 

	public void readFromFile(String fileName){

		try{
			fileInput = new FileInputStream(fileName);
			objectInput = new ObjectInputStream(fileInput);
			vehicles.addAll((ArrayList<Vehicle>)objectInput.readObject());
			objectInput.close();

			if (!file.exists()){
				throw new FileNotFoundException();
			}



		}catch(FileNotFoundException ex){
			System.err.println("File does not exist");
		}catch (IOException e){
			System.err.println("File is empty!!");
		}catch (ClassNotFoundException exx){
			System.err.println("Could not load file");

		}

	}

	public void writeToFile(){

		try{
			fileOut = new FileOutputStream(file);
			objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(vehicles);


			if (!file.exists()){
				throw new FileNotFoundException();
			}



		}catch(FileNotFoundException ex){
			System.err.println("File does not exist");
		}catch (IOException e){
			System.err.println("Wrong file input,try again");
		}

	}



	/**
	 * The simulate method is mainly using collection sort method and collection shuffle to comparing vehicles and shuffling vehicles randomly.
	 * It also has iterator to taking next vehicles and displaying them.
	 * It also has other operator
	 * which is used to display noise of vehicles.
	 */

	public void simulate(){
		for (int i = 0 ; i < 6; i++) {
			

			System.out.println("Update on the street: ");

			Collections.sort(vehicles , vehicleComparator);

			Iterator<Vehicle> iteratorOne = vehicles.iterator();
			Iterator<Vehicle> iteratorTwo = vehicles.iterator();

			while(iteratorOne.hasNext()){
				Vehicle v = iteratorOne.next();
				System.out.println(v.toString()+ " has speed "+ v.getSpeed());

			}

			Collections.shuffle(vehicles);

			//for(int k=0; k<vehicles.size(); k++){

			while(iteratorTwo.hasNext()){

				Vehicle v = iteratorTwo.next();
				System.out.println(v.toString() + ":" + v.makeNoise()  );


			} // end of second condition


			Vehicle random = vehicles.get(randomNumbers.nextInt(vehicles.size())); 
			random.pushingPedal();

			System.out.println("The pedal of " + random.toString() + " was pushed "); // v.toString()   ??????

			System.out.println();

		} // end of condition main




	}
	/**
	 * The main method used to set the size of frame through street object.
	 * @param args
	 */

	public static void main (String[] args) {
		Street theStreet = new Street();
		theStreet.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		theStreet.setSize( 400, 200 );
		theStreet.setVisible( true );

	} 

} 
