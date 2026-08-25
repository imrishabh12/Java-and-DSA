// Q10 - Find sum of digits of a number recursively.

package p3_level1_foundation_of_recursion;

import java.util.Scanner;

public class q10 {

    static int sumDigits(int n) {

        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = sumDigits(n);

        System.out.println("Sum of digits = " + sum);
    }
}