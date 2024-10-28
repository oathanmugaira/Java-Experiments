//Aim: Write a program in java to display number between 1 to 10 except 5 using continue statement.
// Name: Pahtan Mugaira
// UIN : 231P084


 package skl_oop_b2;
 
import java.util.*;
public class one_to_ten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n;
		System.out.print("Enter the last number for the for loop: ");
		n = sc.nextInt();	
		for (int i  = 1; i <= n; i++)
		{
			if (i == 5)
				continue;
			System.out.println(i); 
		}
		System.out.println("Out of the for loop now.");

	}

}