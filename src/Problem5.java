package src;

import java.util.Scanner;

public class Problem5 {
    /*
    getFibonacci - function to find definition of fibonacci
    n - user input value to perform fibonacci function
    return - giving final solution of fibonacci by recursive
     */
    public static int getFibonacci(int n) // Creating function to find Fibonacci
    {
            if (n == 0 || n == 1) // Conditions  n equals 1 or n equals 0 , if true returns themselves
        {
            return n;
        } else {
            return getFibonacci(n - 1) + getFibonacci(n - 2); // Returns the Fibonacci solution by using recursive function
        }
    }
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(getFibonacci(n));
    }
}
