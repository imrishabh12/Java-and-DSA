// Q3 - Print all numbers between a and b divisible by 7.

package p2_level3_mathematical_and_logical_patterns;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {

            if (i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}