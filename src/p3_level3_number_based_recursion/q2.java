// Q2 - Reverse a number recursively.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q2 {

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

        int result = reverse(n, 0);

        System.out.println("Reverse = " + result);
    }
}