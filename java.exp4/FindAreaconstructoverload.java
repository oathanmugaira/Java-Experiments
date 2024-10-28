package skl_B2;
/*
 * Aim:Write a program to find Area of Circle using constructor overloading
//Name:Pathan Mugaira
//UIN:231P084
//Div:A

 */
import java.util.*;
public class FindArea_b2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double r1;
 int r2;

 Scanner sc =new Scanner(System.in);
 Areaof a1=new Areaof();
 System.out.println("Enter Radius 01:");
 r1 =sc.nextDouble();
 Areaof b1=new Areaof (r1);
 System.out.println("Enter Radius 02:");
 r2 =sc.nextInt();
 Areaof c1=new Areaof(r2);
 System.out.println("Area of Circle ----- Radius=0:");

 a1.display();

 System.out.println("Area of Circle ----- Radius= "+r1);
 b1.display();
 System.out.println("Area of Circle ----- Radius= "+r2);
 c1.display();
 System.out.println("   Hrishi Patil 231P080 47");
}

}

class Areaof
{ 
   double r;
   Areaof()
{
   r=0;
}
   Areaof(double radious)
{
   r=radious;
}
   Areaof(int radious)
{
   r=radious;
}
void display()
{ 
	System.out.println("Area of Circle : "+(3.14*r*r));
	
	}
}