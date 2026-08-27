// Q1 - Reverse a string using recursion.

package p3_level3_recursion_on_string;

import java.util.Scanner;

public class q1 {

    static String reverse(String str) {

        if (str.length() == 0) {
            return "";
        }

        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = reverse(str);

        System.out.println("Reversed string = " + result);
    }
}