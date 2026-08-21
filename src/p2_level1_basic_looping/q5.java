// Q5 - Print the table of a given number (n × 1 to n × 10).

package p2_level1_basic_looping;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}