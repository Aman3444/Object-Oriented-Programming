package Exception;

//ArrayAccess.java
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ArrayAccess extends JFrame 
{
private JTextField inputField;
private JTextField retrieveField1;
private JTextField retrieveField2;
private JTextField outputField;
private JPanel inputArea; 
private JPanel retrieveArea;
private JPanel outputArea;

private int num;
private int index = 0;
private int array[] = new int[ 10 ];
private String result;

// set up GUI
public ArrayAccess()
{
   super( "Accessing Array values" );
   setLayout( new FlowLayout() );
   
   // set up input Panel
   inputArea = new JPanel();
   inputArea.add( new JLabel( "Enter array elements here" ) );
   inputField = new JTextField( 10 );
   inputArea.add( inputField );
   inputField.addActionListener( 
      new ActionListener()
      {
         public void actionPerformed( ActionEvent e )
         {
            /* Create a try block in which the application reads the number
               entered in the inputField and assigns it to the next index 
               in the array, then increments instance variable index. */
         	try 
				{
					String text1 = inputField.getText();
					num = Integer.parseInt(text1);
					array[index] = num;
					index++;
} 
               
            /* Write catch handlers that catch the two types of exceptions
               that the previous try block might throw (NumberFormatException
               and ArrayIndexOutOfBoundsException), and display appropriate 
               messages in error message dialogs. */
         	catch(NumberFormatException numberFormatException)
			   {
					JOptionPane.showMessageDialog(null, "Please enter only integer values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
			   }

			   catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
			   {
					JOptionPane.showMessageDialog(null, "Array may contain only 10 elements", "Invalid Input", JOptionPane.ERROR_MESSAGE);
			   }

			 
   	
         	
         	
  	
            
            inputField.setText( "" );
         } // end method actionPerformed
      } // end anonymous inner class
   ); // end call to addActionListener
   
   // set up retrieve Panel
   retrieveArea = new JPanel( new GridLayout( 2, 2 ) );
   retrieveArea.add( new JLabel( "Enter number to retrieve" ) );
   retrieveField1 = new JTextField( 10 );
   retrieveArea.add( retrieveField1 );
   retrieveField1.addActionListener( 
      new ActionListener() 
      {
         public void actionPerformed( ActionEvent event ) 
         {
            /* Create a try block in which the application reads from 
               retrieveField1 the number the user wants to find in the 
               array, then searches the current array contents for the number.
               If the number is found, the outputField should display all the 
               indices in which the number was found. If the number is not 
               found, a NumberNotFoundException should be thrown. */
          	try
				{
					boolean found = false;
					String t1 = retrieveField1.getText();
					num = Integer.parseInt(t1);
					for(int i = 0; i < array.length; i++)
					{
						if(array[i] == num)
						{
							result = String.format( "Index: %d", num);
							found = true;
							
					}
						outputField.setText(result);
					}
					result ="";
					
					
					if(found == false)
					{
						throw new NumberNotFoundException();

					}
				}
            
            /* Write catch handlers that catch the two types of exceptions that
               the try block might throw (NumberFormatException and 
               NumberNotFoundException), and display appropriate messages 
               in error message dialogs. */
          	
          	  catch(NumberFormatException numberFormatException)
			   {
					JOptionPane.showMessageDialog(null, "Please enter only integer values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
			   }

			   catch(NumberNotFoundException numberNotFoundException)
			   {
					JOptionPane.showMessageDialog(null, "Number not found in array", "Invalid Input", JOptionPane.ERROR_MESSAGE);
			   }

          	
             
            retrieveField1.setText( "" );
         } // end method actionPerformed
      } // end anonymous inner class
   ); // end call to addActionListener
         
   retrieveArea.add( new JLabel( "Enter index to retrieve" ) );
   retrieveField2 = new JTextField( 10 );
   retrieveArea.add( retrieveField2 );
   retrieveField2.addActionListener(
      new ActionListener() 
      {
         public void actionPerformed( ActionEvent event )
         {
            /* Create a try block in which the application reads from 
               retrieveField2 the index of a value in the array, then 
               displays the value at that index in the outputField. If the index
               input by the user is not a number a NumberFormatException should
               be thrown. If the number input by the user is outside the array 
               bounds or represents an element in which the application has not
               stored a value, an ArrayIndexOutOfBoundsException should 
               be thrown. */
         	  try
			   {
					String text1 = retrieveField2.getText();
					num = Integer.parseInt(text1);
					result = String.format("Value: %d", array[num]);
					outputField.setText(result);
					
					if (num<=0||num>10){
						throw new ArrayIndexOutOfBoundsException();

					}
}
            /* Write catch handlers that catch the two types of exceptions
               the try block might throw (NumberFormatException and 
               ArrayIndexOutOfBoundsException), and display appropriate 
               messages in error message dialogs. */
         	
         	  
         	  catch(NumberFormatException numberFormatException)
			   {
					JOptionPane.showMessageDialog(null, "Please enter only integer values", "Invalid Input", JOptionPane.ERROR_MESSAGE);
			   }
			   catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException)
			   {
					JOptionPane.showMessageDialog(null, "Index not found", "Invalid Input", JOptionPane.ERROR_MESSAGE);
} 
            retrieveField2.setText( "" );
         } // end anonymous inner class
      } // end new ActionListener
   ); // end call to addActionListener
   
   // set up output Panel
   outputArea = new JPanel();
   outputArea.add( new JLabel( "Result" ) );
   outputField = new JTextField( 30 );
   outputField.setEditable( false );
   outputArea.add( outputField );

   add( inputArea );
   add( retrieveArea );
   add( outputArea );
}  // end constructor
} // end class ArrayAccess

/**************************************************************************
* (C) Copyright 1992-2012 by Deitel & Associates, Inc. and               *
* Pearson Education, Inc. All Rights Reserved.                           *
*                                                                        *
* DISCLAIMER: The authors and publisher of this book have used their     *
* best efforts in preparing the book. These efforts include the          *
* development, research, and testing of the theories and programs        *
* to determine their effectiveness. The authors and publisher make       *
* no warranty of any kind, expressed or implied, with regard to these    *
* programs or to the documentation contained in these books. The authors *
* and publisher shall not be liable in any event for incidental or       *
* consequential damages in connection with, or arising out of, the       *
* furnishing, performance, or use of these programs.                     *
*************************************************************************/