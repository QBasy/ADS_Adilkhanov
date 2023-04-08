package src;

import java.util.Scanner;

public class Problem4 {
    public static int Factorial(int n) // Creating function to find factorial solution
    {
        int avg = 1; // Creating variable avg with value 1
        for (int j = 1; j <= n; j++) // Creating loop to multiply our avg to all values from 1 to n
        {
            avg = avg * j; // Multiplying avg to value
        }
        return avg; // Returns the solution of the factorial
    }
    public static void main()
    {
        Scanner num = new Scanner(System.in); // Creating Scanner function to read user input
        int n = num.nextInt(); // Creating variable n and giving it user value
        System.out.println(Factorial(n)); // Outputs the solution of function
    }
}
