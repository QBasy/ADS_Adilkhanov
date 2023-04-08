package src;

import java.util.Scanner;

public class Problem5 {
    public static int Fibonacci(int n) // Creating function to find Fibonacci
    {
            if (n == 0 || n == 1) // Conditions  n equals 1 or n equals 0 , if true returns themselves
        {
            return n;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2); // Returns the Fibonacci solution by using recursive function
        }
    }
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
    }
}
