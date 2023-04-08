package src;

import java.util.Scanner;


public class Problem3 {
    public static String FindPrimeNumber(int n, int i) {
        if (n <= 2) { // First Condition
            return "Prime";
        }
        else if (n % i == 0) { // Second condition, n is divisible by i
            return "Composite";
        }
        else if (i * i > n) { // Third condition ,i squared is greater than n
            return "Prime";
        }
        else { // recursive
            return FindPrimeNumber(n, i+1);
        }
    }

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        System.out.println(FindPrimeNumber(n, 2));
    }
}