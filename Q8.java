//Write a java program to check whether the elements of an array are sorted or not. If sorted, display the order, otherwise sort elements in ascending order
// or descending order as per user‟s choice.

import java.util.Arrays;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Input the array elements
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Check if the array is sorted and display the result
        if (isSorted(array)) {
            if (isSortedInAscendingOrder(array)) {
                System.out.println("The array is sorted in ascending order.");
            } else {
                System.out.println("The array is sorted in descending order.");
            }
        } else {
            System.out.println("The array is not sorted.");
            // Prompt the user to choose how to sort the array
            System.out.print(" Enter 1 or 2:  to sort the array in ascending (1) or descending (2) order ");
            int choice = scanner.nextInt();
            if (choice == 1) {
                Arrays.sort(array);
                System.out.println("The array sorted in ascending order: " + Arrays.toString(array));
            } else if (choice == 2) {
                Arrays.sort(array);
                reverseArray(array);
                System.out.println("The array sorted in descending order: " + Arrays.toString(array));
            } else {
                System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }

    // Method to check if the array is sorted
    public static boolean isSorted(int[] array) {
        return isSortedInAscendingOrder(array) || isSortedInDescendingOrder(array);
    }

    // Method to check if the array is sorted in ascending order
    public static boolean isSortedInAscendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to check if the array is sorted in descending order
    public static boolean isSortedInDescendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // Method to reverse the array for descending order sort
    public static void reverseArray(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
