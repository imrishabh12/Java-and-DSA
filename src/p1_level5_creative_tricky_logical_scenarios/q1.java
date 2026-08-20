// Q1 - Take coordinates (x, y) and check if the point lies on the X-axis, Y-axis, or at the origin.

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        if (x == 0 && y == 0) {
            System.out.println("Point is at the Origin");
        } else if (y == 0) {
            System.out.println("Point lies on the X-axis");
        } else if (x == 0) {
            System.out.println("Point lies on the Y-axis");
        } else {
            System.out.println("Point lies neither on X-axis nor Y-axis");
        }
    }
}