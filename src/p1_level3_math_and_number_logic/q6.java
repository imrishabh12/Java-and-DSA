// Q6 - Take coordinates (x, y) and determine which quadrant the point lies in.

package p1_level3_math_and_number_logic;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x-coordinate: ");
        int x = sc.nextInt();

        System.out.print("Enter y-coordinate: ");
        int y = sc.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Point lies in Quadrant I");
        } else if (x < 0 && y > 0) {
            System.out.println("Point lies in Quadrant II");
        } else if (x < 0 && y < 0) {
            System.out.println("Point lies in Quadrant III");
        } else if (x > 0 && y < 0) {
            System.out.println("Point lies in Quadrant IV");
        } else if (x == 0 && y == 0) {
            System.out.println("Point lies at the Origin");
        } else if (x == 0) {
            System.out.println("Point lies on the Y-axis");
        } else {
            System.out.println("Point lies on the X-axis");
        }
    }
}