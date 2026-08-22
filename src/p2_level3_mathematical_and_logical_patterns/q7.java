// Q7 - Find the sum of all factors of a number.

package p2_level3_mathematical_and_logical_patterns;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                sum = sum + i;
            }
        }

        System.out.println("Sum of factors = " + sum);
    }
}