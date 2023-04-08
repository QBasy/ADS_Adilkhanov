package src;

import java.util.Scanner;
public class Problem1 {
    public static int FindSmallestValueInArray(int[] arr, int n) // Creating a function to find the smallest value in array
    {
        int lowest = 0; // Initialize variable to hold the smallest value found
        for (int i = 0; i < n; i++) // This loop iterates through each element of the array
        {
            for (int j = i + 1; j < n; j++) // This loop iterates through all elements after the current element
            {
                if (arr[i] > arr[j]) // Compare the current element with each of the elements after it
                {
                    lowest = arr[i]; // Save the element as the smallest found so far
                    arr[i] = arr[j]; // Swap the element with the smaller
                    arr[j] = lowest; // Set the smaller element as the new current element
                }
            }
        }
        return arr[0]; // Returning the smallest value of given array
    }
    public static void main()
    {
        Scanner scanner = new Scanner(System.in); // Creating Scanner to read user input
        int n = scanner.nextInt(); // Input array size
        int[] arr = new int[n]; // Creating the array with our array size
        for (int i = 0; i < n; i++) // Creating loop to add each element off array by the Scanner
        {
            arr[i] = scanner.nextInt(); // Input each element of array
        }
        System.out.println(FindSmallestValueInArray(arr,n)); // Output the smallest value of array by using function
    }
}
