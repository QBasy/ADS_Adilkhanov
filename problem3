import java.util.Scanner;
public class Main {
    public static String primefinder(int n)
    {
        String a = "Prime";
        for (int i = 2; i <= n / 2; ++i)
        {
            if (n % i == 0) {
                a = "Composite";
            }
        }
        return a;
    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int n = number.nextInt();
        System.out.println(primefinder(n));
    }
}
