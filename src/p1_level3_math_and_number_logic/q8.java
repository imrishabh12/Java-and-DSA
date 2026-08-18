// Q8 - Check if a number lies within the range [100, 999].

package p1_level3_math_and_number_logic;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num >= 100 && num <= 999) {
            System.out.println("Number lies within the range [100, 999]");
        } else {
            System.out.println("Number does not lie within the range [100, 999]");
        }
    }
}