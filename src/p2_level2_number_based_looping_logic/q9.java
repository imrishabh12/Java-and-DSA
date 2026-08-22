// Q9 - Print Fibonacci series up to n terms.

package p2_level2_number_based_looping_logic;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {

            System.out.print(first + " ");

            int next = first + second;

            first = second;
            second = next;
        }
    }
}