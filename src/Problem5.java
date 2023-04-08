package src;

import java.util.Scanner;

public class Problem5 {
    public static int Fibonacci(int n) // Creating function to find Fibonacci
    {
        if (n == 0 || n == 1) // Creating if statement with conditions  n=1 and n=0
        {
            return n; // if the conditions are true it will return given number
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2); // Returns the Fibonacci solution by using recursive function
        }
    }
    public static void main()
    {
        Scanner scanner = new Scanner(System.in); // Creating Scanner function to read user input values
        int n = scanner.nextInt(); // Creating varaiable n and giving the user input value
        System.out.println(Fibonacci(n)); // Output founded Fibonacci by the using function with user value
    }
}
