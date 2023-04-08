import java.util.Scanner;
import static java.lang.Math.pow;

public class Problem6 {
    public static double Power(double n, double a) // Creating function to find value a in power n
    {
        return pow(a,n); // Returns value a in power n by Using java.lang.Math.pow
    }
    public static void main()
    {
        Scanner num = new Scanner(System.in); // Creating Scanner function to read user input values
        double a = num.nextDouble(); // Creating the first variable to give a number value by using scanner
        double n = num.nextDouble(); // Creating the second value to give a power value by using scanner
        System.out.println(Power(n,a)); // Outputs the value of the number a in power of n by using function Power
    }
}
