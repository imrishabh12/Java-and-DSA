// Q8 - Take an integer (1–9999) and check if the sum of its digits is greater than the product of its digits.

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer (1-9999): ");
        int num = sc.nextInt();

        if (num >= 1 && num <= 9999) {

            int temp = num;
            int sum = 0;
            int product = 1;

            while (temp > 0) {

                int digit = temp % 10;

                sum = sum + digit;
                product = product * digit;

                temp = temp / 10;
            }

            System.out.println("Sum of digits: " + sum);
            System.out.println("Product of digits: " + product);

            if (sum > product) {
                System.out.println("Sum is greater than product");
            } else {
                System.out.println("Sum is not greater than product");
            }

        } else {
            System.out.println("Invalid number");
        }
    }
}