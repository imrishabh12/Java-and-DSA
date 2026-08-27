// Q4 - Remove all spaces from a string recursively.

package p3_level3_recursion_on_string;

import java.util.Scanner;

public class q4 {

    static String removeSpaces(String str, int index) {

        if (index == str.length()) {
            return "";
        }

        char ch = str.charAt(index);

        if (ch == ' ') {
            return removeSpaces(str, index + 1);
        }

        return ch + removeSpaces(str, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = removeSpaces(str, 0);

        System.out.println("String without spaces = " + result);
    }
}