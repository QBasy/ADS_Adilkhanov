import java.util.Scanner;

public class Main {
    public static double Power(double n, double a) // Creating function to find value a in power n
    {
        double c = 1; // Creating double variable
        if (n == 0) // First statement n equals to 0
        {
            return 1; // Returns value 1
        }
        if (n == 1) // Second statement n equals to 1
        {
            return a; // Returns value a
        }
        if (n <= -1) // Third statement n is less or equal to -1
        {
            for (int i = -1; i >= n; i--) // Creating loop for each number from n to -1
            {
                c = c * a; // Multiplying c to a
            }
            return 1/c; // Returns a in power n
        }
        for (int i = 1; i <= n; i++) // Creating loop for each number from 1 to n
        {
            c = c * a; // Multiplying c to a
        }
        return c; // Returns value a in power n
    }
    public static void main(String[] args)
    {
        Scanner num = new Scanner(System.in); // Creating Scanner function to read user input values
        double a = num.nextDouble(); // Creating the first variable to give a number value by using scanner
        double n = num.nextDouble(); // Creating the second value to give a power value by using scanner
        System.out.println(Power(n,a)); // Outputs the value of the number a in power of n by using function Power
    }
}
