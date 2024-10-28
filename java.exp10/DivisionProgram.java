/*
NAME : Pathan Mugaira
UIN : 231P084
ROLL NO : 25
EXP10 :Write a program to perform division of two numbers accepted from user. Handle the
IOException, NumberFormatException and also handle the divide by exception using multiple
try
catch block.
*/
import java.util.Scanner;

import java.util.Scanner; 
public class DivisionProgram {
    public static void main(String args[]) {
    double numerator, denominator, result; Scanner sc = new Scanner(System.in);
    System.out.println("Enter the first number (numerator):"); try {
    numerator = sc.nextDouble();
    System.out.println("Enter the second number (denominator):"); try { denominator = sc.nextDouble();
    try {
    result = numerator / denominator; System.out.println("Result: " + result);
    } catch (ArithmeticException ae) {
    System.out.println("Error: Division by zero is not allowed.");
    }
    } catch (Exception e) {
    System.out.println("Error: Invalid input for denominator. Please enter a valid number.");
    }} catch (Exception e) {
    System.out.println("Error: Invalid input for numerator. Please enter a valid number.");
    } finally { sc.close();   } } }
    