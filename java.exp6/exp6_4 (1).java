package b2_25;

import java.util.Scanner;
import java.util.Vector;

public class exp6_4 {


		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			String obj;
			
			Vector list = new Vector();
			list.addElement("milk");
			list.addElement("egg");	
			list.addElement("butter");	
			list.addElement("curd");	
			list.addElement("Cake");	
			System.out.println ("Enter item");
			 obj=sc.nextLine();
			list.insertElementAt(obj,1);
			System.out.println("The list :-"+list);
			
			list.remove(4);
			System.out.println("The list after removing item:-"+list);
			
		}

	

	}


