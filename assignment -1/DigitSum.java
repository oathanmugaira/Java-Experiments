// Aim: Write a Java program and compute the sum of an integer's digits.
// Name: PATHAN MUGAIRA
// UIN: 231P084
import java.util.*;
public class DigitSum {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a number:");
int num = sc.nextInt();
int sum = 0;
while(num>0) {
sum += num%10;
num /= 10;
}
System.out.println("The Sum of the digits is: "+ sum);
}
}
