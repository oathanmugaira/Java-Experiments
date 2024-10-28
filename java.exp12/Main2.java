// Aim: Write a program in java to compute factorial of a number using package.
// Name: PATHAN MUGAIRA
// UIN: 231P084
import MyPackage.Factorial; import java.u l.Scanner; public class Main2 { public sta c void
    main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to compute its factorial: "); int number = sc.nextInt();
    Factorial factorialCalculator = new Factorial(); int result =
    factorialCalculator.computeFactorial(number);
    System.out.println("The factorial of " + number + " is: " + result);
    }
    } 