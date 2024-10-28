/*
NAME :Pathan Mugaira
UIN : 231P084
ROLL NO : 25
EXP9 : Write a program to calculate area of Rectangle and Circle using abstract class.
*/

abstract class Shape {
    abstract void calculateArea();
    }
    class Rectangle extends Shape {
    int length, breadth;
    Rectangle(int length, int breadth) {
    this.length = length;
    this.breadth = breadth;
    }
    void calculateArea() {
    int area = length * breadth;
    System.out.println("Area of Rectangle: " + area);
    }
    }
    class Circle extends Shape {
    double radius;
    Circle(double radius) {
    this.radius = radius;
    }
    void calculateArea() {
    double area = Math.PI * radius * radius;
    System.out.println("Area of Circle: " + area);
    }
    }
    public class Exp9 {
    public static void main(String[] args) {
    Rectangle rectangle = new Rectangle(5, 3);
    rectangle.calculateArea();
    circle.calculateArea();
    }
    }