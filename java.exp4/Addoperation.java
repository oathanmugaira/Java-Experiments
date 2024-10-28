package skl_B2;
//Name:Pathan Mugaira
//UIN:231P084
//Div:A
public class Addoperation {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method to concatenate two strings
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        Addoperation operation = new Addoperation();

        // Add two integers
        int intResult = operation.add(5, 10);
        System.out.println("Sum of integers: " + intResult);

        // Concatenate two strings
        String strResult = operation.add("Hello, ", "World!");
        System.out.println("Concatenated string: " + strResult);
    }
}

