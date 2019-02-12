import java.util.*;
	import java.util.Scanner;
	
public class ExerciseTwo {
	 
		int[] [] anArray= new int [8] [10];		
		int j=0;
		
		public void printArray() {
			
		
		      for (int i = 0; i < anArray.length; i++) {
		    	  for (j=0;j<anArray[0].length;j++){
		    		  
		         anArray[i][j]=(i*anArray[0].length + j+1);
		    	  }
		         }
		}
		

		
		
		
		
		
		public void printArrayStatement(){
			
	System.out.println("int[][] outputArray =  { ");
    
	for (int i = 0; i < anArray.length; i++) {
		System.out.print("   {");

    	for(j=0;j<10;j++){
    	
    	System.out.print(anArray[i][j]);

    	      
     if(j<9){
    	 System.out.print(",");
     }
     }
    	System.out.print("}");
    	if (i<7){
        	    System.out.println(",");
         }
    	
    	
        
    }
    System .out.println();

    System.out.println("};");


    }


public void displayArrayTotal(){
	int sum=0;


	for(int i=0; i < anArray.length;i++){
		for (j=0;j<10;j++){
	
	
		sum+=anArray[i][j];
	}
	
	}
	System.out.println("The Sum total of all elements of myArray1[][] is "+ sum);

	
}


public void  tester(){
	int[][] outputArray =  { 
			{1,2,3,4,5,6,7,8,9,10},
			{11,12,13,14,15,16,17,18,19,20},
			{21,22,23,24,25,26,27,28,29,30},
			{31,32,33,34,35,36,37,38,39,40},
			{41,42,43,44,45,46,47,48,49,50},
			{51,52,53,54,55,56,57,58,59,60},
			{61,62,63,64,65,66,67,68,69,70},
			{71,72,73,74,75,76,77,78,79,80}
			};
	
	
	
System.out.println("int[][] outputArray =  { ");

for (int i =0; i < 8 ; i++) {
	System.out.print("  {");

	for(int j=9;j>=0;j--){
	
	System.out.print(outputArray[i][j]);

	      
 if(j>0){
	 System.out.print(",");
 }
 }
	System.out.print("}");
	if (i<7){
    	    System.out.println(",");
     }
	
	
    
}
System .out.println();

System.out.println("};");


}
	
}


		      
		   
		   
	




