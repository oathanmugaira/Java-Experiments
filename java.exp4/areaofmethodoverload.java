package skl_B2;
/*
 * Aim:Write a program to find Area of Circle using method overloading
 //Name:Pathan Mugaira
//UIN:231P084
//Div:A

 */
import java.util.*;
public class areaofmethodoverload_b2 {
public static void main(String[] args) {
double r1;
int r2;
Scanner sc=new Scanner(System.in);
areaofmethodoverload_b2 a=new areaofmethodoverload_b2();
a.areacircle();

System.out.println("Enter the radius R01 : ");
r1=sc.nextDouble();

areaofmethodoverload_b2 b=new areaofmethodoverload_b2();
b.areacircle(r1);

System.out.println("Enter the radius R02 : ");
r2=sc.nextInt();

areaofmethodoverload_b2 c=new areaofmethodoverload_b2();
c.areacircle();

System.out.println("Area of circle -------- Radius =5 : ");
a.display();
System.out.println("Area of circle -------- Radius = " +r1);
b.display();
System.out.println("Area of circle -------- Radius = " +r2);
c.display();

}
}
class areaofmethodoverload_b2
{
	double r;

	void areacircle()
	{
		r=5;
		
		
		
	}
	void areacircle(double radius) {
		r=radius;
	}
	void areacircle(int radius) {
		r=radius;
	}
	void display() {
		System.out.println("Area of Circle:"+(3.14*r*r));
		
	}
}