package b2_25;
/*
 * Name: Pathan Mugaira Zakeer
 * Class: SE
 * Div: A
 * UIN/Roll no. : 231P084/25 */

/*Write an object oriented program to make a class called as circle. It should have three
methods namely: accept radius, calculate area and display area.*/
 import java.util.Scanner;


public class Circle_1 {
    private double radius;
    private double area;
    
    public void acceptRadius() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        this.radius = scanner.nextDouble();
    }

    public void calculateArea() {
        this.area = Math.PI * Math.pow(this.radius, 2);
    }

    public void displayArea() {
        System.out.println("The area of the circle with radius " + this.radius + " is " + this.area);
    }

    public static void main(String[] args) {
        Circle_1 circle = new Circle_1();
        circle.acceptRadius();
        circle.calculateArea();
        circle.displayArea();
    }
}