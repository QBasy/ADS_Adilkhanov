package src;

import java.util.Scanner;
public class Problem1 {
    /*
    findSmallestValueInArray - function finding the smallest value of given array
    arr - user input array
    n - lenght of array
    smallest - the smallest value in the array, found by recursive
    return - final solution of the function
     */

    public static int findSmallestValueInArray(int[] arr, int n) {
        // If there's only one element in the array, it will returns to caller
        if (n == 1) {
            return arr[0];
        }

        // Finding the smallest value in the rest of the array by using recursive
        int smallest = findSmallestValueInArray(arr, n - 1);

        // Compare the smallest value with the last element in the array
        if (arr[n - 1] < smallest) {
            return arr[n - 1];
        } else {
            return smallest;
        }
    }

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(findSmallestValueInArray(arr, n));
    }
}
