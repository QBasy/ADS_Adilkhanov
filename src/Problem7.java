package src;

import java.util.Scanner;

public class Problem7 {
    /*
    makeArrayReverse - function that makes array reversed
    arr - inputed array
    start - first value of array
    end - last value of array
    return - Recursively call the ArrayReverse function with the next start and end indices, in the end giving reversed array and ends function
     */
    public static double makeArrayReverse(int[] arr, int start, int end) // Creating function to Reverse given array
    {
        if (start >= end) // If the start index is greater than or equal to the end index, the array has been fully reversed
        {
            System.exit(0); // If statement is true function will end
            return 0;
        } else
        {
            int temp = arr[start]; // Store the value of the element at the start index in a temporary variable
            arr[start] = arr[end]; // Assign the value of the element at the end index to the element at the start index
            arr[end] = temp; // Assign the value of the temporary variable to the element at the end index
            return makeArrayReverse(arr, start + 1, end - 1);
        }
    }
    public static void main()
    {
        Scanner num = new Scanner(System.in);
        int n =  num.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = num.nextInt();
        }
        makeArrayReverse(arr, 0, n - 1);
        for (int i = 0; i < n; i++) // Loop wrote Reversed values of array
        {
            System.out.print(arr[i] + " ");
        }
    }
}
