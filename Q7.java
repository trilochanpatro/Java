//Write a menu-based program to convert following –
//Decimal to Binary Number
//Binary to Decimal Number

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu
            System.out.println("\nMenu:");
            System.out.println("1. Convert Decimal to Binary");
            System.out.println("2. Convert Binary to Decimal");
            System.out.println("3. Exit");
            System.out.print("Enter your choice (1-3): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter a decimal number: ");
                    int decimalNumber = scanner.nextInt();
                    String binaryResult = decimalToBinary(decimalNumber);
                    System.out.println("Binary equivalent: " + binaryResult);
                    break;

                case 2:
                    System.out.print("Enter a binary number: ");
                    String binaryNumber = scanner.next();
                    int decimalResult = binaryToDecimal(binaryNumber);
                    System.out.println("Decimal equivalent: " + decimalResult);
                    break;

                case 3:
                    System.out.println("Exiting the program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please select a valid option.");
                    break;
            }
        } while (choice != 3);

        scanner.close();
    }

    // Method to convert Decimal to Binary
    public static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }

    // Method to convert Binary to Decimal
    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }
}
