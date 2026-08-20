// Q5 - Take three numbers and check if they are in arithmetic progression.

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (b - a == c - b) {
            System.out.println("Numbers are in Arithmetic Progression");
        } else {
            System.out.println("Numbers are not in Arithmetic Progression");
        }
    }
}