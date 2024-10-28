package b2_25;
//PATHAN MUGAIRA ZAKEER
//UIN:- 231P084
//DIV:-A,ROLL NO:-25





import java.util.*;
public class  exp6_1
{
public static void main(String args[])
{
Vector list = new Vector();
int len=args.length;
for(int i=0;i<len;i++)
{
list.addElement(args[i]);
}
int size=list.size();
String str[]= new String[size];
list.copyInto(str);

list.copyInto(str);
for(int i=0;i<size;i++)
{
	System.out.println("Elements are :- "+str[i]);
}
}
}
