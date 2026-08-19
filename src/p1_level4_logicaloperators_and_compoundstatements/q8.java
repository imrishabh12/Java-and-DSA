// Q8 - Take a weekday number (1–7) and determine if it is a weekday or weekend.

package p1_level4_logicaloperators_and_compoundstatements;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter weekday number (1-7): ");
        int day = sc.nextInt();

        if (day >= 1 && day <= 5) {
            System.out.println("Weekday");
        } else if (day == 6 || day == 7) {
            System.out.println("Weekend");
        } else {
            System.out.println("Invalid day number");
        }
    }
}