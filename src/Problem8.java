package src;

import java.util.Scanner;

public class Problem8 {
    public static String isVariableContainsLetter(String a) // Creating function to find out if our variable contains any letter
    {
        for (char c = 'a'; c <= 'z'; c++) // Creating loop that gives char values of every letter
        {
            if (a.contains(String.valueOf(c))) // This statement checking out is our String variable contains any letter
            {
                return "No"; // If any letter is inside of the variable it returns value "No"
            }

        }
        return "Yes"; // Returns value "Yes"
    }
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println(isVariableContainsLetter(a));
    }
}
