// Q5 - Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good Evening”, or “Good Night”.

package p1_level2_nested_if_and_multiple_conditions;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour (0-23): ");
        int hour = sc.nextInt();

        if (hour >= 0 && hour <= 23) {

            if (hour >= 5 && hour <= 11) {
                System.out.println("Good Morning");
            } else if (hour >= 12 && hour <= 16) {
                System.out.println("Good Afternoon");
            } else if (hour >= 17 && hour <= 20) {
                System.out.println("Good Evening");
            } else {
                System.out.println("Good Night");
            }

        } else {
            System.out.println("Invalid hour");
        }
    }
}