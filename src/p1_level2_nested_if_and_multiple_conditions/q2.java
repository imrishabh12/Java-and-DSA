// Q2 - If the sides form a valid triangle, determine whether it is equilateral, isosceles, or scalene.

package p1_level2_nested_if_and_multiple_conditions;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();

        if (a + b > c && b + c > a && a + c > b) {

            if (a == b && b == c) {
                System.out.println("Equilateral Triangle");
            } else if (a == b || b == c || a == c) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }

        } else {
            System.out.println("Invalid Triangle");
        }
    }
}