// Q4 - Take 24-hour time (hours and minutes) and print whether it is AM or PM.

package p1_level4_logicaloperators_and_compoundstatements;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();

        if (hour >= 0 && hour <= 23 && minutes >= 0 && minutes <= 59) {

            if (hour < 12) {
                System.out.println("AM");
            } else {
                System.out.println("PM");
            }

        } else {
            System.out.println("Invalid time");
        }
    }
}