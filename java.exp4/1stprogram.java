package skl_B2;
/*
 * Aim:Write a program to find Area of Circle using method overloading
 //Name:Pathan Mugaira
//UIN:231P084
//Div:A

 */
import java.util.*;
class AreaOf
{ double r;
AreaOf( )
{
r=0;
}
AreaOf(double radious)
{
r=radious;
}
AreaOf(int radious)
{
r=radious;
}
void display( )
{ System.out.println(" Area of Circle : "+(3.14*r*r)); }
}
public class FindArea
{
public static void main(String[] args)
{ double r1;
int r2;

Scanner sc =new Scanner(System.in);
AreaOf a1=new AreaOf ( );
System.out.print("Enter Radius 01:");
r1 =sc.nextDouble();
AreaOf b1=new AreaOf (r1);
System.out.print("Enter Radius 02:");
r2 =sc.nextInt();
AreaOf c1=new AreaOf (r2);
System.out.print("Area of Circle ----- Radius=0 :");

a1.display();

System.out.print("Area of Circle ----- Radius= :"+r1);
b1.display();
System.out.print("Area of Circle ----- Radius= :"+r2);
c1.display();
}
}