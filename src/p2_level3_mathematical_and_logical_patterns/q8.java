// Q8 - Check if a number is a strong number (sum of factorials of digits = number).

package p2_level3_mathematical_and_logical_patterns;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int sum = 0;

        while (n != 0) {

            int digit = n % 10;

            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial = factorial * i;
            }

            sum = sum + factorial;

            n = n / 10;
        }

        if (sum == original) {
            System.out.println("Strong number");
        } else {
            System.out.println("Not a strong number");
        }
    }
}