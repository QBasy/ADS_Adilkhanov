package src;

import java.util.Scanner;

public class Problem8 {
    /*
    isVariableContainsLetter - the function of finding char in user input
    String a - User input
    char c - in takes value of each letter of the English alphabet
    return - recursive checking is variable a contains letter 'a', if doesnt it move to next letter
     */
    public static String isVariableContainsLetter(String a, char c) {
        if (c > 'z' && c > 'Z') { // If checked all letters
            return "Yes"; // If no letter is found, return "Yes"
        }
        return a.contains(String.valueOf(c)) ? "No" : isVariableContainsLetter(a, ++c); // check next letter
    }
    public static void main()
    {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        System.out.println(isVariableContainsLetter(a, 'c'));
    }
}
