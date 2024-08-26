//Write a Java program to create a shape class and derive, square and circle classes from shape
//class. Define appropriate constructor for all the three classes. Define a method Area( ) to calculate
//area of circle and square in respective class. Assume PI = 3.14 and
//declare it as a final variable in circle class.

import java.util.Scanner;

// Base Shape class
class Shape {
    // This class can be expanded to include common attributes and methods for all shapes
    public Shape() {
        // Constructor for Shape
    }
}

// Derived Square class
class Square extends Shape {
    private double side;

    // Constructor for Square
    public Square(double side) {
        this.side = side;
    }

    // Method to calculate the area of the square
    public double Area() {
        return side * side;
    }
}

// Derived Circle class
class Circle extends Shape {
    private double radius;
    private final double PI = 3.14;  // Declaring PI as a final variable

    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double Area() {
        return PI * radius * radius;
    }
}

// Main class to test the shape classes
public class Q13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Square
        System.out.print("Enter the side length of the square: ");
        double side = scanner.nextDouble();
        Square square = new Square(side);

        // Calculate and display the area of the square
        System.out.println("Area of the Square: " + square.Area());

        // Input for Circle
        System.out.print("\nEnter the radius of the circle: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(radius);

        // Calculate and display the area of the circle
        System.out.println("Area of the Circle: " + circle.Area());

        scanner.close();
    }
}
