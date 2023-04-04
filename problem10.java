import java.util.Scanner;

public class Main {
    public static int GCD(int a, int b)
    {
        int c;
        if (a == b)
        {
            return a;
        }
        if (a == 1 || b == 1)
        {
            return 1;
        }
        if (a == 0 || b == 0)
        {
            return 0;
        }
        int y;
        y = Math.min(a, b);
        c = y;
        while(a % b != 0)
        {
            c = a % b;
            a = b;
            b = c;
        }
        return c;

    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        int a = number.nextInt();
        int b = number.nextInt();
        System.out.println(GCD(a,b));
    }
}
