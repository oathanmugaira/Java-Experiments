package b2_25;
/*
 * Name: Pathan Mugaira Zakeer
 * Class: SE
 * Div: A
 * UIN/Roll no. : 231P084/25 */
 /*Write a program to create a class Account to perform the operation of insert, deposit and
withdrawal of single employee and make use of object. */
import java.util.*;
class transaction
{
		int acc_no;
		String name;
		float amount;
		 
		void insert(int a,String n,float amt)
		{
			acc_no=a;
			name=n;
			amount=amt;
		}
		
		void deposit(float amt)
		{
			amount=amount+amt;
			System.out.println(amt+" deposited");
		}
		void withdraw(float amt)
		{
			if(amount<amt)
			{ 
		       System.out.println("Insufficeint Balance");
			}
			else	
			{
				amount=amount-amt;
				System.out.println(amt + "withdrawn");

			}
		}

void display()
{
	System.out.println("Account Number :"+acc_no);
	System.out.println("Customer Name : "+name);
	System.out.println("Customer Amount :"+amount);

}
void checkBalance()
{
	System.out.println("Balance is: "+amount);}
}

public class Accounts_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int acc_no;
		String name;
		float amount;
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Enter Account Number:");
		acc_no=sc.nextInt();
		System.out.println("\n Enter Name of the Account Holder:");
		name=sc.next();
		System.out.println("\n Enter Amount:");
		amount=sc.nextFloat();
		transaction obj1=new transaction();
        obj1.insert(acc_no, name, amount);
        obj1.display();
        obj1.checkBalance();
        System.out.print("\n Enter Amount to be deposited : ");
        float dep_amount=sc.nextFloat();
        obj1.deposit(dep_amount);
        obj1.checkBalance();
        System.out.print("\n Enter Amount to be withdrawn : ");
        float wit_amount=sc.nextFloat();
        obj1.withdraw(wit_amount);
        obj1.checkBalance();
        System.out.print("\n THANK YOU ");
	}

}
