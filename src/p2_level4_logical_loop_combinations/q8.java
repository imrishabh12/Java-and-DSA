// Q8 - Print factorial of each number from 1 to n.

package p2_level4_logical_loop_combinations;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int factorial = 1;

            for (int j = 1; j <= i; j++) {
                factorial = factorial * j;
            }

            System.out.println(i + "! = " + factorial);
        }
    }
}