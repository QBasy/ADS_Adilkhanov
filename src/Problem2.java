package src;

import java.util.Scanner;

public class Problem2 {
    /*
    getAverageOfArray - function finds average of all numbers of array
    arr - user input array
    n - array lenght
    return 0 - if array's lenght equals to 0
    return - giving the final solution of function by recursive
     */
    public static double getAverageOfArray(int[] arr, int n)
    {
        // If array size equals to 0, it returns zero
        if (n == 0) {
            return n;
        }
        else { // If array size is greater than 0, it returns Average of values by using recursive
            return ((getAverageOfArray(arr, n-1) * (n-1)) + arr[n-1]) / n;
        }
    }

    public static void main()
    {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = num.nextInt();
        }
        System.out.println(getAverageOfArray(arr,n));
    }
}
