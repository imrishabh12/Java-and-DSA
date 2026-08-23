// Q9 - Print the sum of all odd digits and even digits separately in a number.

package p2_level4_logical_loop_combinations;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int oddSum = 0;
        int evenSum = 0;

        while (n != 0) {

            int digit = n % 10;

            if (digit % 2 == 0) {
                evenSum = evenSum + digit;
            } else {
                oddSum = oddSum + digit;
            }

            n = n / 10;
        }

        System.out.println("Sum of odd digits = " + oddSum);
        System.out.println("Sum of even digits = " + evenSum);
    }
}