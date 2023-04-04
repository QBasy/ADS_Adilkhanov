import java.util.Scanner;

public class Main {
    public static double ArrayReverse(int[] arr, int start, int end)
    {
        if (start >= end)
        {
            return 0;
        } else
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            return ArrayReverse(arr, start + 1, end - 1);
        }
    }
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int n =  num.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = num.nextInt();
        }
        ArrayReverse(arr, 0, n - 1);
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
