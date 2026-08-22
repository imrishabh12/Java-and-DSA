// Q10 - Print the sum of first n terms of Fibonacci series.

package p2_level2_number_based_looping_logic;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        int sum = 0;

        for (int i = 1; i <= n; i++) {

            sum = sum + first;

            int next = first + second;

            first = second;
            second = next;
        }

        System.out.println("Sum: " + sum);
    }
}