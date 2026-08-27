// Q5 - Replace all occurrences of a character (say 'a' -> 'x') recursively.

package p3_level3_recursion_on_string;

import java.util.Scanner;

public class q5 {

    static String replaceCharacter(String str, int index, char oldChar, char newChar) {

        if (index == str.length()) {
            return "";
        }

        char ch = str.charAt(index);

        if (ch == oldChar) {
            ch = newChar;
        }

        return ch + replaceCharacter(str, index + 1, oldChar, newChar);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter new character: ");
        char newChar = sc.next().charAt(0);

        String result = replaceCharacter(str, 0, oldChar, newChar);

        System.out.println("Updated string = " + result);
    }
}