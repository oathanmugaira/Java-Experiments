// AIM: Write a program to perform Menu Driven Arithmetic Operation using characters as input. 
//Name: Pathan Mugaira UIN: 231P084


package skl_op_package;
import java.util.*;
public class ArithmeticOperation2 {

	public static void main(String[] args) {
		
		int x, y;
		char choice;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\t\tTHIS PROGRAM PERFORMS MENU DRIVEN ARITHMETIC OPERATION :\n\n");
		System.out.println("\tMENU\n");
		System.out.println("\t+ = Adition\n");
		System.out.println("\t- = Subtraction\n");
		System.out.println("\t* = Multiplication\n");
		System.out.println("\t/ = Division\n");
		System.out.println("\t% = Modulus\n");
		System.out.println("\tE = Exit\n\n");
		
		do {
		// Input Choice
		System.out.println("Enter your choice: ");
		choice = sc.next().charAt(0);
		switch(choice)
		{
		case '+': 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nAddition of "+x+" and "+y+" : "+(x+y));
			break;
		case '-': 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nSubtraction of "+x+" and "+y+" : "+(x-y));
			break;
		case '*': 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nMultiplication of "+x+" and "+y+" : "+(x*y));
			break;
		case '/': 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nDivision of "+x+" and "+y+" : "+(x/y));
			break;
		case '%': 	
			System.out.println("\nInput :");
			System.out.println("\nEnter First Number: ");
			x = sc.nextInt();
			System.out.println("\nEnter Second Number: ");
			y = sc.nextInt();
			
			System.out.println("\nModulus of "+x+" and "+y+" : "+(x%y));
			break;
		case 'E': 	
			System.out.println("\nThank You");
			break;
		default: 
			System.out.println("\nWrong Choice!!");
		}}while (choice!='E');
	}

}
