// Q1 - Take a 3-digit number and check if all digits are distinct.

package p1_level3_math_and_number_logic;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int first = num / 100;
        int second = (num / 10) % 10;
        int third = num % 10;

        if (first != second && second != third && first != third) {
            System.out.println("All digits are distinct");
        } else {
            System.out.println("All digits are not distinct");
        }
    }
}