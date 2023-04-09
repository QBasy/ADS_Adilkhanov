package src;

import java.util.Scanner;

public class Problem6 {
    /*
    getPower - function finding the a in power n
    n - power value
    a - number reduced to a power
    return - final solution of a in power n
     */
    public static double getPower(double n, double a) // Creating function to find value a in power n
    {
        if (n == 0) // Condition when n is equal to 0
        {
            return 1; // Returns value 1
        }
        else
        {
            return a * getPower(a, n-1); // Returns the value of a to the power of n to the caller
        }
    }
    public static void main()
    {
        Scanner num = new Scanner(System.in);
        double a = num.nextDouble();
        double n = num.nextDouble();
        System.out.println(getPower(n,a));
    }
}
