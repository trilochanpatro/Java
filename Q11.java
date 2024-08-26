//Write a program in Java with class Rectangle with the data fields width, length, area and color.
//The length, width and area are of double type and color is of string type .The methods are set_
//length () , set_width (), set_ color(), and find_ area (). Create two object of Rectangle and compare
//their area and color. If area and color both are same for the objects then display “Matching
//Rectangles” otherwise display “Non matching Rectangle”.

import java.util.Scanner;

class Rectangle {
    // Data fields
    private double width;
    private double length;
    private double area;
    private String color;

    // Method to set the length
    public void setLength(double length) {
        this.length = length;
    }

    // Method to set the width
    public void setWidth(double width) {
        this.width = width;
    }

    // Method to set the color
    public void setColor(String color) {
        this.color = color;
    }

    // Method to calculate the area
    public void findArea() {
        this.area = this.length * this.width;
    }

    // Getter methods for area and color
    public double getArea() {
        return this.area;
    }

    public String getColor() {
        return this.color;
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create the first Rectangle object
        Rectangle rect1 = new Rectangle();
        System.out.println("Enter details for the first rectangle:");
        System.out.print("Enter length: ");
        rect1.setLength(scanner.nextDouble());
        System.out.print("Enter width: ");
        rect1.setWidth(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter color: ");
        rect1.setColor(scanner.nextLine());
        rect1.findArea();

        // Display the area of the first rectangle
        System.out.println("Area of the first rectangle: " + rect1.getArea());

        // Create the second Rectangle object
        Rectangle rect2 = new Rectangle();
        System.out.println("Enter details for the second rectangle:");
        System.out.print("Enter length: ");
        rect2.setLength(scanner.nextDouble());
        System.out.print("Enter width: ");
        rect2.setWidth(scanner.nextDouble());
        scanner.nextLine(); // Consume the newline
        System.out.print("Enter color: ");
        rect2.setColor(scanner.nextLine());
        rect2.findArea();

        // Display the area of the second rectangle
        System.out.println("Area of the second rectangle: " + rect2.getArea());

        // Compare the area and color of the two rectangles
        if (rect1.getArea() == rect2.getArea() && rect1.getColor().equalsIgnoreCase(rect2.getColor())) {
            System.out.println("Matching Rectangles");
        } else {
            System.out.println("Non-matching Rectangles");
        }

        scanner.close();
    }
}
