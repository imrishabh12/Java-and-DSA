// Q5 - Check if a number is an Armstrong number.

package p2_level2_number_based_looping_logic;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int original = n;
        int temp = n;

        int digits = 0;

        if (n == 0) {
            digits = 1;
        } else {

            while (temp != 0) {
                temp = temp / 10;
                digits++;
            }
        }

        temp = n;

        int sum = 0;

        while (temp != 0) {

            int digit = temp % 10;

            int power = 1;

            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }

            sum = sum + power;

            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an Armstrong number");
        }
    }
}