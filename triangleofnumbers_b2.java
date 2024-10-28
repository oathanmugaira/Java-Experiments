package skl_oop_b2;

 
//Aim: Write a program in java to display pyramind of numbers
//Name:Pathan Mugaira
//UIN : 231P085


import java.util.*;

public class patten_forloop_B2_odd {

	public static void main(String[] args) 
	
{
		
	    		 int i, j,n; 
		 Scanner sc=new Scanner (System.in); 
		  
		 System.out.print("enter number of rows or column: ");
		 n=sc.nextInt(); 
		  
		 for(i=0; i<n; i++) //outer loop for number of rows(n)
		 {  
			 for(j=0; j<=i; j++) // inner loop for columns 
			 {  
				 System.out.print("* "); // print star  }  
			 } 
			 System.out.println(); // ending line after each row  }
		} 

	}

}


