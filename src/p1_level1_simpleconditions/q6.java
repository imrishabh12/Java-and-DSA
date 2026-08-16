// Q6 - Take two numbers and print the larger one.

package p1_level1_simpleconditions;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("Larger number is: " + num1);
        } else if (num2 > num1) {
            System.out.println("Larger number is: " + num2);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}