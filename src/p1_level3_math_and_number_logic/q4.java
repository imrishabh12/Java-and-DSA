// Q4 - Check whether a given integer is single-digit, double-digit, or multi-digit.

package p1_level3_math_and_number_logic;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        int value = Math.abs(num);

        if (value <= 9) {
            System.out.println("Single-digit");
        } else if (value <= 99) {
            System.out.println("Double-digit");
        } else {
            System.out.println("Multi-digit");
        }
    }
}