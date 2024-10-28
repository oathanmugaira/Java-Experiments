package b2_skl_java;
//Name:- Pathan Mugaira
//Div:-A Roll No:- 25
//UIN:-231P084
import java.io.*;
import java.util.Scanner;
class Account
{
String cust_name;
int acc_no;
Account(String a, int b)
{
cust_name=a;
acc_no=b;
}
void display()
{
System.out.println ("Customer Name: "+cust_name);
System.out.println ("Account No: "+acc_no);
}
}
class Online extends Account
{
Online(String a, int b)
{ super(a,b); }
void display()
{
System.out.println ("Customer-Id: "+(cust_name+acc_no%10));
System.out.println ("Customer Password: "+(acc_no/10+8));
}
}
class Saving_Acc extends Account
{
int min_bal,saving_bal;
Saving_Acc(String a, int b, int c, int d)
{
super(a,b);
min_bal=c;
saving_bal=d;
}
void display()
{
super.display();
System.out.println ("Minimum Balance: "+min_bal);
System.out.println ("Saving Balance: "+saving_bal);
}
}
class Acct_Details extends Saving_Acc
{
int deposits, withdrawals;
Acct_Details(String a, int b, int c, int d, int e, int f)
{
super(a,b,c,d);
deposits=e;
withdrawals=f;
}
void display()
{
super.display();
System.out.println ("Deposit: "+deposits);
System.out.println ("Withdrawals: "+withdrawals);
}
}
public class exp7_q1
{
public static void main(String args[])

{
	String a;
	int b,c,d,e,f;
	Scanner sc=new Scanner (System.in);
	
	System.out.println( "Enter Name");
	a=sc.nextLine();
	System.out.println( "Enter Account no");
	b=sc.nextInt();
	System.out.println( "Minimum");
	c=sc.nextInt();
	System.out.println( "Saving ");
	
	d=sc.nextInt();
	System.out.println( "Deposit");
	
	e=sc.nextInt();
	System.out.println( "Withdrawal");
	f=sc.nextInt();
	
Acct_Details A = new Acct_Details(a,b,c,d,e,f);
Online ol=new Online(a,b);
A.display();
ol.display();
}
}