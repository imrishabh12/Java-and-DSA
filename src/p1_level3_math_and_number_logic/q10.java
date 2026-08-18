// Q10 - Check whether a number is a perfect square (without using the square root function).

package p1_level3_math_and_number_logic;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPerfectSquare = false;

        if (num >= 0) {

            for (int i = 0; i * i <= num; i++) {

                if (i * i == num) {
                    isPerfectSquare = true;
                    break;
                }
            }
        }

        if (isPerfectSquare) {
            System.out.println("Perfect Square");
        } else {
            System.out.println("Not a Perfect Square");
        }
    }
}