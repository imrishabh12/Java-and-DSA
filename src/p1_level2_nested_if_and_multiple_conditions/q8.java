// Q8 - Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

package p1_level2_nested_if_and_multiple_conditions;

import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an alphabet character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            ch = Character.toLowerCase(ch);
        }

        if (ch >= 'a' && ch <= 'm') {
            System.out.println("Character lies between a and m");
        } else if (ch >= 'n' && ch <= 'z') {
            System.out.println("Character lies between n and z");
        } else {
            System.out.println("Invalid character");
        }
    }
}