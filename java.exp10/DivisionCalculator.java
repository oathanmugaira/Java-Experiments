/*
NAME : Pathan Mugaira
UIN : 231P084
ROLL NO : 25
EXP10:Write a program to perform division of two numbers accepted from user. Handle the
NumberFormatException and also handle the divide by exception using nested try catch block.
*/

import java.util.Scanner;
public class DivisionCalculator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
double num1 = 0;
double num2 = 0;
// Get the first number
while (true) {
try {
System.out.print("Enter the first number: ");
num1 = Double.parseDouble(scanner.nextLine()); // Attempt to parse input
break; // Exit the loop if successful
} catch (NumberFormatException e) {
System.out.println("Invalid input! Please enter a valid number."); // Handle invalid input
}
}
// Get the second number
while (true) {
try {
System.out.print("Enter the second number: ");
num2 = Double.parseDouble(scanner.nextLine()); // Attempt to parse input
break; // Exit the loop if successful
} catch (NumberFormatException e) {
System.out.println("Invalid input! Please enter a valid number."); // Handle invalid input
}
}
// Perform division
try {
double result = num1 / num2; // Attempt to divide
System.out.println("The result of " + num1 + " divided by " + num2 + " is: " + result);
} catch (ArithmeticException e) {
System.out.println("Error! Division by zero is not allowed."); // Handle division by zero
}
scanner.close(); // Close the scanner
}
}