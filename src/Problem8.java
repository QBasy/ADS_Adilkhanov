package src;

import java.util.Scanner;

public class Problem8 {
    /*
    isVariableContainsLetter - the function of finding char in user input
    String a - User input
    for (...) - loop to bring char to the value of each letter
    char c - in loop takes value of each letter of the English alphabet
    if - condition checking is string contains char value
    'return "No"' and 'return "Yes" - giving the final definition of function
     */
    public static String isVariableContainsLetter(String a) // Creating function to find out if our variable contains any letter
    {
        for (char c = 'a'; c <= 'z'; c++) // Creating loop that gives char values of every lowercase letter
        {
            if (a.contains(String.valueOf(c))) // This statement checking out is our String variable contains any letter
            {
                return "No"; // If any letter is inside of the variable it returns value "No"
            }

        }
        for (char c = 'A'; c<= 'Z'; c++) // Same but for UPPERCASE LETTERS
        {
            if (a.contains(String.valueOf(c)))
            {
                return "No";
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
