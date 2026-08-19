// Q9 - Take electricity units consumed and calculate the bill as per slabs (using if-else).

package p1_level4_logicaloperators_and_compoundstatements;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter electricity units consumed: ");
        int units = sc.nextInt();

        double bill;

        if (units < 0) {
            System.out.println("Invalid units");

        } else if (units <= 100) {
            bill = units * 1.50;
            System.out.println("Electricity bill: ₹" + bill);

        } else if (units <= 200) {
            bill = (100 * 1.50) + ((units - 100) * 2.50);
            System.out.println("Electricity bill: ₹" + bill);

        } else if (units <= 500) {
            bill = (100 * 1.50)
                    + (100 * 2.50)
                    + ((units - 200) * 4.00);

            System.out.println("Electricity bill: ₹" + bill);

        } else {
            bill = (100 * 1.50)
                    + (100 * 2.50)
                    + (300 * 4.00)
                    + ((units - 500) * 6.00);

            System.out.println("Electricity bill: ₹" + bill);
        }
    }
}