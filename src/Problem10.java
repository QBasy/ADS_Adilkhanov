package src;

import java.util.Scanner;

public class Problem10 {
    public static int FindGCD(int a, int b)
    {
        if (b == 0)
        {
            return a;
        } else
        {
            return FindGCD(b, a % b);
        }
    }
    public static void main()
    {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        System.out.println(FindGCD(a,b));
    }
}
