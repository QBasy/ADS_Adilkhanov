package src;

import java.util.Scanner;

public class Problem4 {
    public static int getFactorial(int n) {
        if (n == 0) { // Condition if n equals to 0, returns 1
            return 1;
        }
        else { // recursive
            return n * getFactorial(n-1);
        }
    }

    public static void main() {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        System.out.println(getFactorial(n));
    }
}