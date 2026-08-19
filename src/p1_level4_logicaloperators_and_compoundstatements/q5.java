// Q5 - Take income and age, and check if eligible for tax (age > 18 and income > 5 L).

package p1_level4_logicaloperators_and_compoundstatements;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter income in lakhs: ");
        double income = sc.nextDouble();

        if (age > 18 && income > 5) {
            System.out.println("Eligible for tax");
        } else {
            System.out.println("Not eligible for tax");
        }
    }
}