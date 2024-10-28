// Aim: Write a program in java to display triangle of numbers
//Name Pathan Mugaira

//UIN:-231P084
package skl_oop_b2;
import java.util.*;
public class number_pyramid {
public static void main(String[] args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of rows and column: ");
		n = sc.nextInt();
		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(" " + j + " ");
			}

			System.out.print("\n");
		}

	}
}