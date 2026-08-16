// Q3 - Check if a number is divisible by 5.

package p1_level1_simpleconditions;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 5 == 0) {
            System.out.println("The number is divisible by 5");
        } else {
            System.out.println("The number is not divisible by 5");
        }
    }
}