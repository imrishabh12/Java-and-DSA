// Q5 - Find the smallest and largest digit in a given number.

package p2_level4_logical_loop_combinations;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int smallest = 9;
        int largest = 0;

        while (n != 0) {

            int digit = n % 10;

            if (digit < smallest) {
                smallest = digit;
            }

            if (digit > largest) {
                largest = digit;
            }

            n = n / 10;
        }

        System.out.println("Smallest digit = " + smallest);
        System.out.println("Largest digit = " + largest);
    }
}