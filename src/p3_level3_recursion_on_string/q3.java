// Q3 - Count vowels in a string recursively.

package p3_level3_recursion_on_string;

import java.util.Scanner;

public class q3 {

    static int countVowels(String str, int index) {

        if (index == str.length()) {
            return 0;
        }

        char ch = Character.toLowerCase(str.charAt(index));

        int count = 0;

        if (ch == 'a' || ch == 'e' || ch == 'i' ||
                ch == 'o' || ch == 'u') {
            count = 1;
        }

        return count + countVowels(str, index + 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int result = countVowels(str, 0);

        System.out.println("Number of vowels = " + result);
    }
}