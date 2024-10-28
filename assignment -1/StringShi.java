// Aim: Create a simple Java application that allows users to perform various
// string manipulation operations. The tool should provide a menu-driven
// interface where users can choose from the following functionalities:
// 1. Reverse a String: Take a user-provided string and return it
// reversed.
// 2. Check for Palindrome: Check if the provided string is a
// palindrome (reads the same forward and backward).
// 3. Count Vowels and Consonants: Count the number of vowels
// and consonants in the given string.
// 4. Convert to Uppercase and Lowercase: Convert the string to
// uppercase and lowercase.
// 5. Find Substring: Check if a specific substring exists within the
// string.
// Name: PATHAN MUGAIRA
// UIN: 231P084
import java.util.*;
public class StringShi {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int choice;
while (true) {
System.out.println("MAIN MENU");
System.out.println("1. Reverse a String.");
System.out.println("2. Check for Palindrome");
System.out.println("3. Count vowel/consonants");
System.out.println("4. Convert to Uppercase/Lowercase");
System.out.println("5. Find Substring.");
System.out.println("6. Exit");
System.out.print("Enter your choice (1-6):");
choice = sc.nextInt();
System.out.println("\n");
String string1, string2;
switch (choice) {
case 1:
System.out.println("REVERSING A STRING");
System.out.print("Enter a string: ");
sc.nextLine();
string1 = sc.nextLine();
string2 = "";
for (int i = string1.length() - 1; i >= 0; i--) {
string2 = string2 + string1.charAt(i);
}
System.out.println("The Reversed String now is: " + string2);
break;
case 2:
System.out.println("CHECKING FOR PALINDROME");
System.out.println("Enter a String: ");
sc.nextLine();
string1 = sc.nextLine();
boolean flag = true;
int n = string1.length() - 1;
for (int i = 0; i <= n / 2; i++) {
if (string1.charAt(i) != (string1.charAt(n - i)))
flag = false;
}
if (flag)
System.out.println("The Entered String is a Palindrome.");
else
System.out.println("The Entered String is not a Palindrome.");
break;
case 3:
System.out.println("COUNTING VOWELS AND CONSONANTS");
System.out.println("Enter a String: ");
sc.nextLine();
string1 = sc.nextLine();
char vowels[] = { 'a', 'A', 'e', 'E', 'i', 'I', 'u', 'U', 'o', 'O' };
int vowel = 0;
for (int i = 0; i <= string1.length() - 1; i++) {
for (int j = 0; j <= vowels.length - 1; j++) {
if (string1.charAt(i) == vowels[j])
vowel++;
}
}
System.out.println("In the given sentence, \nVowels: " + vowel + "\nConsonants: "
+ (string1.length() - vowel));
break;
case 4:
System.out.println("CONVERSION TO UPPERCASE/LOWERCASE");
System.out.println("Enter a String: ");
sc.nextLine();
string1 = sc.nextLine();
System.out.println("The String entered in uppercase is: " + string1.toUpperCase());
System.out.println("The String entered in lowercase is: " + string1.toLowerCase());
break;
case 5:
System.out.println("FINDING A SUBSTRING IN A STRING");
System.out.println("Enter a String: ");
sc.nextLine();
string1 = sc.nextLine();
System.out.println("Enter a substring to find in the String");
string2 = sc.nextLine();
if (string1.indexOf(string2) > 0)
System.out.println("The entered substring is found at the index position of: " +
string1.indexOf(string2));
else
System.out.println("The entered substring doesnt exist within the string.");
break;
case 6:
System.exit(0);
default:
System.out.println("Invalid Input\n");
}
}
}
}