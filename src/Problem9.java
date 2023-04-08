package src;

import java.util.Scanner;

public class Problem9 {
    public static int FindBinomialCoefficient(int n, int k) // Creating the function to find binomial coefficent by using user values n and k
    {
        if (k == 0 || n == k) // Creating statement to check if k is equal 0, or is n equal k
        {
            return 1; // Returns 1 if statement is true
        }
        else {
            return FindBinomialCoefficient(n-1, k-1) + FindBinomialCoefficient(n-1, k); // Returns the final solution by using the recursive function
        }
    }

    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(FindBinomialCoefficient(n,k));
    }
}
