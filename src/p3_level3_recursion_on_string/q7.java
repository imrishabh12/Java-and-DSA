// Q7 - Print all characters of a string one by one recursively.

package p3_level3_recursion_on_string;

import java.util.Scanner;

public class q7 {

    static void printCharacters(String str, int index) {

        if (index == str.length()) {
            return;
        }

        System.out.println(str.charAt(index));

        printCharacters(str, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        printCharacters(str, 0);
    }
}