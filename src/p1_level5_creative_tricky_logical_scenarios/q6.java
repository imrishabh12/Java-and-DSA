// Q6 - Take three numbers and check if they are in geometric progression.

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        boolean isGP;

        if (a == 0) {
            isGP = (b == 0 && c == 0);
        } else {
            isGP = (b * b == a * c);
        }

        if (isGP) {
            System.out.println("Numbers are in Geometric Progression");
        } else {
            System.out.println("Numbers are not in Geometric Progression");
        }
    }
}