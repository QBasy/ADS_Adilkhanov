import java.util.Scanner;

public class SmallestInArr {
    public static int smallest(int[] arr, int n)
    {
        int lowest;
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (arr[i] > arr[j])
                {
                    lowest = arr[i];
                    arr[i] = arr[j];
                    arr[j] = lowest;
                }
            }
        }
        return arr[0];
    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = number.nextInt();
        }
        System.out.println(smallest(arr,n));
    }
}