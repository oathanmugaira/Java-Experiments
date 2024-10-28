// AIM: Write a program to perform Menu Driven Arithmetic Operation 
//Name: Pathan Mugaira UIN: 231P084

package skl_op_package;
import java.util.*;
public class ArithmeticOperation {

	public static void main(String[] args) {
		
		int choice, x, y;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\t\tTHIS PROGRAM PERFORMS MENU DRIVEN ARITHMETIC OPERATION :\n\n");
		System.out.println("\tMENU\n");
		System.out.println("\t1. Adition\n");
		System.out.println("\t2. Subtraction\n");
		System.out.println("\t3. Multiplication\n");
		System.out.println("\t4. Division\n");
		System.out.println("\t5. Modulus\n");
		System.out.println("\t6. Exit\n\n");
		
		do {
		// Input Choice
		System.out.println("Enter your choice: ");
		choice = sc.nextInt();
		
		switch(choice)
		{
		case 1: 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nAddition of "+x+" and "+y+" : "+(x+y));
			break;
		case 2: 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nSubtraction of "+x+" and "+y+" : "+(x-y));
			break;
		case 3: 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nMultiplication of "+x+" and "+y+" : "+(x*y));
			break;
		case 4: 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nDivision of "+x+" and "+y+" : "+(x/y));
			break;
		case 5: 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nModulus of "+x+" and "+y+" : "+(x%y));
			break;
		case 6: 	
			System.out.println("\nThank You");
			break;
		default: 
			System.out.println("\nWrong Choice!!");
		}}while (choice!=6);
	}

}
