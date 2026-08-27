// Q6 - Remove all occurrences of a character from a string recursively.

package p3_level3_recursion_on_string;

import java.util.Scanner;

public class q6 {

    static String removeCharacter(String str, int index, char removeChar) {

        if (index == str.length()) {
            return "";
        }

        char ch = str.charAt(index);

        if (ch == removeChar) {
            return removeCharacter(str, index + 1, removeChar);
        }

        return ch + removeCharacter(str, index + 1, removeChar);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);

        String result = removeCharacter(str, 0, removeChar);

        System.out.println("Updated string = " + result);
    }
}