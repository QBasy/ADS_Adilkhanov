package src;

import java.util.Scanner;


public class Problem3 {
    /*
    findPrimeNumber - function decides a given number is prime or composite
    n - is experimental rat
    i - number with a value of 2
    return "Prime" and "Composite" - giving the final solution
    return findPrimeNumber(n, i+1) - recursive function adds the number 1 to i
     */
    public static String findPrimeNumber(int n, int i) {
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
            return findPrimeNumber(n, i+1);
        }
    }

    public static void main() {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        System.out.println(findPrimeNumber(n, 2));
    }
}