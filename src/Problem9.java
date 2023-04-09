package src;

import java.util.Scanner;

public class Problem9 {
    /*
    findBinomialCoefficient - definition of Binomial Coefficient
    n - represents the total number of items
    k - represents the number of items to be selected
    return - giving the final solution of Binomial Coefficient
     */
    public static int findBinomialCoefficient(int n, int k) // Creating the function to find binomial coefficent by using user values n and k
    {
        if (k == 0 || n == k) // Creating statement to check if k is equal 0, or is n equal k
        {
            return 1; // Returns 1 if statement is true
        }
        else {
            return findBinomialCoefficient(n-1, k-1) + findBinomialCoefficient(n-1, k); // Returns the final solution by using the recursive function
        }
    }

    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(findBinomialCoefficient(n,k));
    }
}
