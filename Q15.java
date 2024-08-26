//Write a java program which creates an interface having 2 methods add () and sub(). Create a class
//which implements the above interface for addition and subtraction of two numbers respectively

import java.util.Scanner;

// Define an interface with two methods: add() and sub()
interface MathOperations {
    // Method to add two numbers
    int add(int a, int b);

    // Method to subtract two numbers
    int sub(int a, int b);
}

// Class that implements the MathOperations interface
class Calculator implements MathOperations {

    // Implement the add() method
    @Override
    public int add(int a, int b) {
        return a + b;
    }

    // Implement the sub() method
    @Override
    public int sub(int a, int b) {
        return a - b;
    }
}

// Main class to test the Calculator class
public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an instance of Calculator
        Calculator calculator = new Calculator();

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform addition and subtraction using the Calculator class
        int sum = calculator.add(num1, num2);
        int difference = calculator.sub(num1, num2);

        // Display the results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);

        scanner.close();
    }
}
