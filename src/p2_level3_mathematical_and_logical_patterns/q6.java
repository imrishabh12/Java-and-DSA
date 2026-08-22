// Q6 - Print all factors of a given number.

package p2_level3_mathematical_and_logical_patterns;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Factors are:");

        for (int i = 1; i <= n; i++) {

            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}