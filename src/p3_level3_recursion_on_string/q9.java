// Q9 - Convert a string to uppercase recursively.

package p3_level3_recursion_on_string;

import java.util.Scanner;

public class q9 {

    static String toUpperCase(String str, int index) {

        if (index == str.length()) {
            return "";
        }

        char ch = Character.toUpperCase(str.charAt(index));

        return ch + toUpperCase(str, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = toUpperCase(str, 0);

        System.out.println("Uppercase string = " + result);
    }
}