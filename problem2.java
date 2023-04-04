import java.util.Scanner;
public class Main {
    public static double avg(int[] arr, int n)
    {
        double avg = 0;
        for (int j : arr) {
            avg = avg + j;
        }
        avg = avg/n;
        return avg;
    }
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in);
        int n = num.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = num.nextInt();
        }
        System.out.println(avg(arr,n));
    }
}
