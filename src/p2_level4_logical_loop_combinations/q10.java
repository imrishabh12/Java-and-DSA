// Q10 - Take 5 numbers as input. If the user enters 0, skip it using continue.
// At the end, print the sum of all non-zero numbers entered.

package p2_level4_logical_loop_combinations;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sum = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.print("Enter number " + i + ": ");
            int n = sc.nextInt();

            if (n == 0) {
                continue;
            }

            sum = sum + n;
        }

        System.out.println("Sum of non-zero numbers = " + sum);
    }
}