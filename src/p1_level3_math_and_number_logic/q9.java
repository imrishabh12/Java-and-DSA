// Q9 - Take two angles of a triangle and compute the third angle.

package p1_level3_math_and_number_logic;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first angle: ");
        int angle1 = sc.nextInt();

        System.out.print("Enter second angle: ");
        int angle2 = sc.nextInt();

        int angle3 = 180 - angle1 - angle2;

        if (angle1 > 0 && angle2 > 0 && angle3 > 0) {
            System.out.println("Third angle is: " + angle3);
        } else {
            System.out.println("Invalid angles for a triangle");
        }
    }
}