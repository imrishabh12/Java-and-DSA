// Q3 - Take day and month and check if it forms a valid calendar date (ignoring leap years).

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day: ");
        int day = sc.nextInt();

        System.out.print("Enter month: ");
        int month = sc.nextInt();

        int maxDays;

        if (month == 2) {
            maxDays = 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDays = 30;
        } else if (month >= 1 && month <= 12) {
            maxDays = 31;
        } else {
            maxDays = 0;
        }

        if (maxDays != 0 && day >= 1 && day <= maxDays) {
            System.out.println("Valid date");
        } else {
            System.out.println("Invalid date");
        }
    }
}