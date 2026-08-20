// Q9 - Take two dates (day and month) and determine which one comes first in the calendar.

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first date - day: ");
        int day1 = sc.nextInt();

        System.out.print("Enter first date - month: ");
        int month1 = sc.nextInt();

        System.out.print("Enter second date - day: ");
        int day2 = sc.nextInt();

        System.out.print("Enter second date - month: ");
        int month2 = sc.nextInt();

        if (month1 >= 1 && month1 <= 12 &&
                month2 >= 1 && month2 <= 12 &&
                day1 >= 1 && day1 <= 31 &&
                day2 >= 1 && day2 <= 31) {

            if (month1 < month2) {
                System.out.println("First date comes first");
            } else if (month1 > month2) {
                System.out.println("Second date comes first");
            } else if (day1 < day2) {
                System.out.println("First date comes first");
            } else if (day1 > day2) {
                System.out.println("Second date comes first");
            } else {
                System.out.println("Both dates are the same");
            }

        } else {
            System.out.println("Invalid date");
        }
    }
}