// Q4 - Check if one of two given numbers is a multiple of the other.

package p1_level2_nested_if_and_multiple_conditions;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 != 0 && num2 != 0) {

            if (num1 % num2 == 0 || num2 % num1 == 0) {
                System.out.println("One number is a multiple of the other");
            } else {
                System.out.println("Neither number is a multiple of the other");
            }

        } else {
            System.out.println("Please enter non-zero numbers");
        }
    }
}