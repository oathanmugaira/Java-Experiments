package skl_oop_b2;

 // Name:Pathan Mugaira
 // UIN : 231P084
 

public class label_b2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			{ 
				stop: { 
				nextRow: 
				for(int row=1;row<=7;row++) 
				   { 
				   if (row==6) 
				   break stop; 
				   System.out.println(); 
				   for(int column=1;column<=10;column++) 
				      { 
				      if(column>row) 
				      continue nextRow; 
				      System.out.print(" * "); 
				        } 
				            } 
				               } 
	                              }
		}

	}
