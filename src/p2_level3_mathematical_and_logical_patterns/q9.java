// Q9 - Print first n terms of an arithmetic progression (a, d).

package p2_level3_mathematical_and_logical_patterns;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        int term = a;

        for (int i = 1; i <= n; i++) {

            System.out.print(term + " ");

            term = term + d;
        }
    }
}