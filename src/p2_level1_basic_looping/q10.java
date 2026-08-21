// Q10 - Print the product of digits of a given number.

package p2_level1_basic_looping;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int product = 1;

        while (num > 0) {

            int digit = num % 10;

            product = product * digit;

            num = num / 10;
        }

        System.out.println("Product of digits = " + product);
    }
}