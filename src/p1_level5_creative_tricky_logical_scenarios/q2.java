// Q2 - Take three numbers and check if they can form a Pythagorean triplet.

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > 0 && b > 0 && c > 0) {

            if (a * a + b * b == c * c ||
                    a * a + c * c == b * b ||
                    b * b + c * c == a * a) {

                System.out.println("They form a Pythagorean triplet");

            } else {
                System.out.println("They do not form a Pythagorean triplet");
            }

        } else {
            System.out.println("Numbers must be positive");
        }
    }
}