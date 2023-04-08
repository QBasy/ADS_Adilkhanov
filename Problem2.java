import java.util.Scanner;

public class Problem2
{
    public static double FindAverageOfArray(int[] arr, int n) // Creating a function to find the average value inside the array
    {
        double avg = 0; // Initialize a variable average
        for (int j : arr) // Creating loop to summarize every value of array to our average
            {
                avg = avg + j; // Here is the summarizing
            }
            avg = avg/n; // Dividing our average to array size
            return avg; // Returning completed average
    }
    public static void main()
    {
        Scanner num = new Scanner(System.in); // Creating Scanner function to read user input
        int n = num.nextInt(); // Input size of array
        int[] arr = new int[n]; // Creating the array with given size
        for (int i = 0; i < n; i++) // Creating loop to input each value of array
        {
            arr[i] = num.nextInt(); // There is input
        }
        System.out.println(FindAverageOfArray(arr,n)); // Output average by using function
    }
}

