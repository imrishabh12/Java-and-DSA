// Q1 - Take three sides and check if they form a valid triangle.

package p1_level2_nested_if_and_multiple_conditions;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }
}