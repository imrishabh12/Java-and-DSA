// Q6 - Take two numbers and check if both are positive and their sum is less than 100.

package p1_level4_logicaloperators_and_compoundstatements;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > 0 && num2 > 0 && num1 + num2 < 100) {
            System.out.println("Both numbers are positive and their sum is less than 100");
        } else {
            System.out.println("Condition not satisfied");
        }
    }
}