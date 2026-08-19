// Q10 - Take a password string and check basic rules (length ≥ 8 and contains at least one digit).

package p1_level4_logicaloperators_and_compoundstatements;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        boolean hasDigit = false;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (ch >= '0' && ch <= '9') {
                hasDigit = true;
                break;
            }
        }

        if (password.length() >= 8 && hasDigit) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
    }
}