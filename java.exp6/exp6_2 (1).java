package b2_25;
//PATHAN MUGAIRA ZAKEER
//UIN:- 231P084
//DIV:-A,ROLL NO:-25
import java.util.*;
public class exp6_2 {
	public static void main(String args[])
	{
		String str,rev;
		StringBuffer str1 = new StringBuffer();
		Scanner sc= new Scanner(System.in);
		System.out.print ("Enter a String :");
		str=sc.nextLine(); 
		str1.append(str); 
		str1.reverse(); 
		rev=str1.toString(); 
		if(str.equals(rev)) 
		System.out.println ("\n  It is a Palindrome");
		else
		System.out.println (" \n It is not a Palindrome");
	}
}
