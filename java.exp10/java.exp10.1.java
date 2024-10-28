/*
NAME : Pathan Mugaira
UIN : 231P084
ROLL NO : 25
EXP10: Write a Program to implement user defined Exception in java.
*/

import java.util.*;
public class Month{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in); System.out.println("Enter the month number:"); n=sc.nextInt(); try
{
if(n>12||n<1)
throw new ArithmeticException();
System.out.println("Month number entered is="+n);
}
catch(ArithmeticException ae)
{
System.out.println("Invalid Number!");
}
}
}
