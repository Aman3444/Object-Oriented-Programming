// Name :- Aman Altaf MUltani
//040877727
//Lab -1

	import java.util.*;
	 
	public class Lab1{
	    public static void main(String args[]) {
	        int  i, j ;
	 
	        //First Triangle
	        
	     for ( i = 1; i <=10; i++)
	        {
	            for ( j = 1; j <=i; j++)
	            {
	               
	            	System.out.print("*");
	            
	            }
	            
	            System.out.println();
	            
	        }
	        System .out.println();
	       
	       
	        
	       //Second Triangle
	        
	       
	      for ( i = 10; i >=1 ; i--)
        {
            for ( j = 1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
            
        }
	      
	      System.out.println();
	       
	    
	    
	      //Third Triangle
	      
	      
	      for(i=0; i < 10; i++)
	         {
	             for(j=0; j < i; j++){
	                 System.out.print(" ");
	             }
	             for(int x=0; x < 10-i; x++){
	                 System.out.print("*");
	             }
	             System.out.println();
	         }
	    
	      
	      
	      
	      //Fourth Triangle
	      
	      
	      for(i=10; i>0; i--)
	         {
	             for(j=0; j < i; j++){
	                 System.out.print(" ");
	             }
	             for(int x=0; x < 10-i; x++){
	                 System.out.print("*");
	             }
	             System.out.println();
	         }
	    
	    
	    
	    }
	}
	
	
	
	
	    
	
	        
	       
	    	


