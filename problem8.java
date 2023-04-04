import java.util.Scanner;

public class Main {
    public static String Checker(String a)
    {
        char c;
        for (c = 'a'; c <= 'z'; c++)
        {
            if (a.contains(String.valueOf(c)))
            {
                return "No";
            }

        }
        return "Yes";
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println(Checker(a));
    }
}
