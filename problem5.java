import java.util.Scanner;
public class Main {
    public static int Fibonacci(int n)
    {
        if (n == 0)(n == 1) {
        return n;
    } else {
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(Fibonacci(n));
    }
}
