//Write a program to create a simple calculator which can perform basic arithmetic operations like addition, subtraction, multiplication or division, exponent (xy), and square root depending upon the user input.

import java.util.Scanner;

public class Q2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Simple Calculator");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exponentiation (x^y)");
            System.out.println("6. Square Root (√x)");
            System.out.println("7. Exit");

            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter first number: ");
                    double addNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double addNum2 = scanner.nextDouble();
                    System.out.println("Result: " + (addNum1 + addNum2));
                    break;

                case 2:
                    System.out.print("Enter first number: ");
                    double subNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double subNum2 = scanner.nextDouble();
                    System.out.println("Result: " + (subNum1 - subNum2));
                    break;

                case 3:
                    System.out.print("Enter first number: ");
                    double mulNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double mulNum2 = scanner.nextDouble();
                    System.out.println("Result: " + (mulNum1 * mulNum2));
                    break;

                case 4:
                    System.out.print("Enter first number: ");
                    double divNum1 = scanner.nextDouble();
                    System.out.print("Enter second number: ");
                    double divNum2 = scanner.nextDouble();
                    if (divNum2 != 0) {
                        System.out.println("Result: " + (divNum1 / divNum2));
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                case 5:
                    System.out.print("Enter base number: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter exponent: ");
                    double exponent = scanner.nextDouble();
                    System.out.println("Result: " + Math.pow(base, exponent));
                    break;

                case 6:
                    System.out.print("Enter number: ");
                    double sqrtNum = scanner.nextDouble();
                    if (sqrtNum >= 0) {
                        System.out.println("Result: " + Math.sqrt(sqrtNum));
                    } else {
                        System.out.println("Error: Cannot take square root of a negative number!");
                    }
                    break;

                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice! Please choose a valid operation.");
                    break;
            }

            System.out.println();
        }
    }
}
