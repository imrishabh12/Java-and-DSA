// Q1 - Count the number of digits in a number recursively.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q1 {

    static int countDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return 1 + countDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Number of digits = 1");
        } else {
            System.out.println("Number of digits = " + countDigits(n));
        }
    }
}