// Q7 - Take a 3-digit number and check if the sum of the first and last digit equals the middle digit.

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {

            int first = num / 100;
            int middle = (num / 10) % 10;
            int last = num % 10;

            if (first + last == middle) {
                System.out.println("Sum of first and last digit equals the middle digit");
            } else {
                System.out.println("Sum of first and last digit does not equal the middle digit");
            }

        } else {
            System.out.println("Invalid 3-digit number");
        }
    }
}