// Q7 - Print digits of a number in words recursively.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q7 {

    static void printDigit(int digit) {

        if (digit == 0) {
            System.out.print("zero ");
        } else if (digit == 1) {
            System.out.print("one ");
        } else if (digit == 2) {
            System.out.print("two ");
        } else if (digit == 3) {
            System.out.print("three ");
        } else if (digit == 4) {
            System.out.print("four ");
        } else if (digit == 5) {
            System.out.print("five ");
        } else if (digit == 6) {
            System.out.print("six ");
        } else if (digit == 7) {
            System.out.print("seven ");
        } else if (digit == 8) {
            System.out.print("eight ");
        } else if (digit == 9) {
            System.out.print("nine ");
        }
    }

    static int findDivisor(int n) {

        if (n < 10) {
            return 1;
        }

        return 10 * findDivisor(n / 10);
    }

    static void printWords(int n, int divisor) {

        if (divisor == 0) {
            return;
        }

        int digit = n / divisor;

        printDigit(digit);

        n = n % divisor;

        printWords(n, divisor / 10);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("zero");
        } else {

            int divisor = findDivisor(n);

            printWords(n, divisor);
        }
    }
}