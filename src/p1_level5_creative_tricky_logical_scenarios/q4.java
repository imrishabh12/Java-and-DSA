// Q4 - Take time (hours and minutes) and print the smaller angle between the hour and minute hands.

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter hour (1-12): ");
        int hour = sc.nextInt();

        System.out.print("Enter minutes (0-59): ");
        int minutes = sc.nextInt();

        if (hour >= 1 && hour <= 12 && minutes >= 0 && minutes <= 59) {

            double hourAngle = hour * 30 + minutes * 0.5;
            double minuteAngle = minutes * 6;

            double difference = Math.abs(hourAngle - minuteAngle);

            if (difference > 180) {
                difference = 360 - difference;
            }

            System.out.println("Smaller angle: " + difference + " degrees");

        } else {
            System.out.println("Invalid time");
        }
    }
}