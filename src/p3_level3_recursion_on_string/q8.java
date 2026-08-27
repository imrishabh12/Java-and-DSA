// Q8 - Print the string in reverse order recursively (without using loops).

package p3_level3_recursion_on_string;

import java.util.Scanner;

public class q8 {

    static void printReverse(String str, int index) {

        if (index < 0) {
            return;
        }

        System.out.print(str.charAt(index));

        printReverse(str, index - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        printReverse(str, str.length() - 1);
    }
}