//Write a program to input order of two matrices and check if it satisfies the condition for product of
//the matrices or not. If it satisfies the condition then find the product of the matrices.
//(Hint: Two matrices can be multiplied if and only if they satisfy the following condition:
//The number of columns present in the first matrix should be equal to the number of rows present in the
//second matrix.)

import java.util.Scanner;

import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the order of the first matrix
        System.out.print("Enter the number of rows of the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns of the first matrix: ");
        int cols1 = scanner.nextInt();

        // Input the order of the second matrix
        System.out.print("Enter the number of rows of the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns of the second matrix: ");
        int cols2 = scanner.nextInt();

        // Check if matrix multiplication is possible
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible. The number of columns in the first matrix must equal the number of rows in the second matrix.");
        } else {
            // Input the elements of the first matrix
            int[][] matrix1 = new int[rows1][cols1];
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols1; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            // Input the elements of the second matrix
            int[][] matrix2 = new int[rows2][cols2];
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            // Initialize the product matrix
            int[][] product = new int[rows1][cols2];

            // Perform matrix multiplication
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    for (int k = 0; k < cols1; k++) {
                        product[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }

            // Display the product matrix
            System.out.println("The product of the matrices is:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.print(product[i][j] + " ");
                }
                System.out.println();
            }
        }

        scanner.close();
    }
}
