// Aim: Create a class Student with private attributes for name and age.
// Use a constructor to initialize these attributes and provide public getter
// methods to access them.
// In the main method, an instance of Student is created, and the student's
// details are printed.
// Name: PATHAN MUGAIRA
// UIN: 231P084
import java.util.*;
class Student {
private String name;
private int age;
Student(String n, int a) {
name = n;
age = a;
}
String getName() {
return name;
}
int getAge() {
return age;
}
}
public class MainStudent {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the name of the student: ");
String name = sc.next();
System.out.print("Enter the age of the student: ");
int age = sc.nextInt();
Student s = new Student(name, age);
System.out.println("Student Name: " + s.getName());
System.out.println("Student Age: " + s.getAge());
}
}