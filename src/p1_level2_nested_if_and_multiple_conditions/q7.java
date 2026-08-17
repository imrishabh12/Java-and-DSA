// Q7 - Take 2 nums and determine whether both are even, both are odd, or 1 is even and 1 is odd.

package p1_level2_nested_if_and_multiple_conditions;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        if (num1 % 2 == 0 && num2 % 2 == 0) {
            System.out.println("Both are even");
        } else if (num1 % 2 != 0 && num2 % 2 != 0) {
            System.out.println("Both are odd");
        } else {
            System.out.println("One is even and one is odd");
        }
    }
}