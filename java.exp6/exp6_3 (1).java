package b2_25;
//PATHAN MUGAIRA ZAKEER
//UIN:- 231P084
//DIV:-A,ROLL NO:-25
import java.util.*;
public class exp6_3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String obj;
		
		Vector list = new Vector();
		list.addElement("Suleiman");
		list.addElement("Mohammed");	
		list.addElement("Abdul");	
		System.out.println ("Enter name");
		 obj=sc.nextLine();
		list.addElement(obj);
		System.out.println("The names are:-"+list);
		System.out.println("After removing element ");
		list.remove(obj);
		System.out.println("The names are:-"+list);
		
	}

}
