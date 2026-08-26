// Q4 - Find product of digits of a number recursively.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q4 {

    static int productDigits(int n) {

        if (n == 0) {
            return 1;
        }

        return (n % 10) * productDigits(n / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int product = productDigits(n);

        System.out.println("Product of digits = " + product);
    }
}