// Q7 - Check if an amount can be evenly divided into 2000, 500, and 100 currency notes.

package p1_level3_math_and_number_logic;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter amount: ");
        int amount = sc.nextInt();

        if (amount % 2000 == 0 && amount % 500 == 0 && amount % 100 == 0) {
            System.out.println("Amount can be evenly divided into 2000, 500, and 100 notes");
        } else {
            System.out.println("Amount cannot be evenly divided into 2000, 500, and 100 notes");
        }
    }
}