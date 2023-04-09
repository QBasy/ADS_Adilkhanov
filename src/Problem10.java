package src;

import java.util.Scanner;

public class Problem10 {
    /*
    findGCD - function to find deffinition of GCD
    a - first value of GCD
    b - second value of GCD
    return FindGCD(b, a % b) - final solution of GCD
     */
    public static int findGCD(int a, int b)
    {
        if (b == 0)
        {
            return a;
        } else if (a == 0)
        {
            return b;
        } else
        {
            return findGCD(b, a % b);
        }
    }
    public static void main()
    {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        System.out.println(findGCD(a,b));
    }
}
