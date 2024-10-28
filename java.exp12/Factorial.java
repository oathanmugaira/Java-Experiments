// Aim: Write a program in java to compute factorial of a number using package.
// Name: Pathan Mugaira

// UIN: 231P084
package MyPackage;
public class Factorial {
public int computeFactorial(int n) {
int fact = 1; for (int i = 1; i <= n; i++) {
fact *= i;
}
return fact;
}
}