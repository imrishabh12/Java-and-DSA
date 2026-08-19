// Q3 - Take three numbers and print the median value (neither maximum nor minimum).

package p1_level4_logicaloperators_and_compoundstatements;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int num3 = sc.nextInt();

        if ((num1 >= num2 && num1 <= num3) || (num1 >= num3 && num1 <= num2)) {
            System.out.println("Median is: " + num1);
        } else if ((num2 >= num1 && num2 <= num3) || (num2 >= num3 && num2 <= num1)) {
            System.out.println("Median is: " + num2);
        } else {
            System.out.println("Median is: " + num3);
        }
    }
}