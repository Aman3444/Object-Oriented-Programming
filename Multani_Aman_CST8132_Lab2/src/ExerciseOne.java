	import java.util.*;
	import java.util.Scanner;

public class ExerciseOne {
		int[] anArray= new int [10];		
		
		
		public void printArray() {
			
		
		      for (int i = 0; i < anArray.length; i++) {
		         anArray[i]=i+1;
		         
		         }
		}
		
public void printArrayStatement(){
	System.out.print("int[] outputArray = {");
    for (int i = 0; i < anArray.length; i++) {
    	System.out.print(anArray[i]);
     if(i<9){
    	 System.out.print(",");
    	 
     }
    }
    System.out.print("};");	        System .out.println();

    }


public void displayArrayTotal(){
	int sum=0;


	for(int i=0; i < anArray.length;i++)
	{
		sum+=anArray[i];
			
	}
	System.out.println("The Sum total of all elements of myArray is "+ sum);

	
}

public void tester(){
	int[] outputArray = {1,2,3,4,5,6,7,8,9,10};
	System.out.print("int[] outputArray = {");
    for (int i = 0; i < outputArray.length; i++) {
    	System.out.print(outputArray[i]);
     if(i<9){
    	 System.out.print(",");
    	 
     }
    }
    System.out.print("};");	        System .out.println();

	
	
	
}
		    	  
		      }
		         
		      
		   
		   
	

