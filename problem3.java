import java.util.Scanner;
public class Main {
    public static String FindPrimeNumber(int n) // Creating function to find Prime number
    {
        String a = "Prime"; // Creating String variable with the value "Prime"
        for (int i = 2; i <= n / 2; ++i) // Creating Loop through all numbers from 2 to n/2
        {
            if (n % i == 0) // Creating if statement to find our number is prime or not
            {
                a = "Composite"; // If our number isn't prime our variable takes the value "Composite"
            }
        }
        return a; // Returns the final value of the variable a
    }
    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in); // Creating function Scannet to read user input
        int n = number.nextInt(); // Creating variable n and reading the user input
        System.out.println(FindPrimeNumber(n)); // Outputs the final solution of the function
    }
}
