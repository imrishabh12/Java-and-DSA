// Q8 - Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.

package p1_level1_simpleconditions;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        int temperature = sc.nextInt();

        if (temperature < 15) {
            System.out.println("Cold");
        } else if (temperature <= 30) {
            System.out.println("Warm");
        } else {
            System.out.println("Hot");
        }
    }
}