package src;

import java.util.Scanner;
public class Problem1 {
    public static int FindSmallestValueInArray(int[] arr, int n) {
        // If there's only one element in the array, it will returns to caller
        if (n == 1) {
            return arr[0];
        }

        // Finding the smallest value in the rest of the array by using recursive
        int smallest = FindSmallestValueInArray(arr, n - 1);

        // Compare the smallest value with the last element in the array
        if (arr[n - 1] < smallest) {
            return arr[n - 1];
        } else {
            return smallest;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(FindSmallestValueInArray(arr, n));
    }
}
