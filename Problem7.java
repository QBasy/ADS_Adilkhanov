import java.util.Scanner;

public class Problem7 {
    public static double ArrayReverse(int[] arr, int start, int end) // Creating function to Reverse given array
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
            return ArrayReverse(arr, start + 1, end - 1); // Recursively call the ArrayReverse function with the next start and end indices
        }
    }
    public static void main()
    {
        Scanner num = new Scanner(System.in); // Creating the Scanner function to read user input
        int n =  num.nextInt(); // Read in the length of the array
        int[] arr = new int[n]; // Create an array of size n
        for (int i = 0; i < n; i++) // Creating loop to give values to each element of array
        {
            arr[i] = num.nextInt(); // Read in the elements of the array
        }
        ArrayReverse(arr, 0, n - 1); // Call the ArrayReverse function with the starting and ending indices of the array
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " "); // Output the elements of the reversed array
        }
    }
}
