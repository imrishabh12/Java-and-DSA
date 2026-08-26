// Q3 - Check if a number is a palindrome using recursion.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q3 {

    static int reverse(int n, int result) {

        if (n == 0) {
            return result;
        }

        int digit = n % 10;

        result = result * 10 + digit;

        return reverse(n / 10, result);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;

        int reverse = reverse(n, 0);

        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}