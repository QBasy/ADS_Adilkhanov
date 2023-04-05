import java.util.Scanner;

public class Main {
    public static String IsVariableContainsLetter(String a) // Creating function to find out if our variable contains any letter
    {
        char c; // Creating char variable without values
        for (c = 'a'; c <= 'z'; c++) // Creating loop that gives our char values of every letter
        {
            if (a.contains(String.valueOf(c))) // This statement checking out is our variable contains any letter
            {
                return "No"; // If any letter is inside of the variable it returns function with value "No"
            }

        }
        return "Yes"; // If variable doesn't contains any letter function returns with value "Yes"
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in); // Creating Scanner function to read user input
        String a = scanner.next(); // Creating variable with user value
        System.out.println(IsVariableContainsLetter(a)); // Outputs the final solution of the function about our variable
    }
}
