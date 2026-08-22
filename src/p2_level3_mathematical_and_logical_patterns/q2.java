// Q2 - Print cubes of numbers from 1 to n.

package p2_level3_mathematical_and_logical_patterns;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + " cube = " + (i * i * i));
        }
    }
}