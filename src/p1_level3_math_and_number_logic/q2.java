// Q2 - Take a 3-digit number and determine if the middle digit is the largest, smallest, or neither.

package p1_level3_math_and_number_logic;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 3-digit number: ");
        int num = sc.nextInt();

        int first = num / 100;
        int middle = (num / 10) % 10;
        int last = num % 10;

        if (middle > first && middle > last) {
            System.out.println("Middle digit is the largest");
        } else if (middle < first && middle < last) {
            System.out.println("Middle digit is the smallest");
        } else {
            System.out.println("Middle digit is neither the largest nor the smallest");
        }
    }
}