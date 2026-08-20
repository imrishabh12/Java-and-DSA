// Q10 - Take a year and print the corresponding century (e.g., "19th century", "20th century").

package p1_level5_creative_tricky_logical_scenarios;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        if (year > 0) {

            int century = (year + 99) / 100;

            String suffix;

            if (century % 100 >= 11 && century % 100 <= 13) {
                suffix = "th";
            } else if (century % 10 == 1) {
                suffix = "st";
            } else if (century % 10 == 2) {
                suffix = "nd";
            } else if (century % 10 == 3) {
                suffix = "rd";
            } else {
                suffix = "th";
            }

            System.out.println(century + suffix + " century");

        } else {
            System.out.println("Invalid year");
        }
    }
}