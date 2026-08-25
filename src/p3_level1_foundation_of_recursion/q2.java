// Q2 - Print numbers from n down to 1 using recursion.

package p3_level1_foundation_of_recursion;

import java.util.Scanner;

public class q2 {

    static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        System.out.print(n + " ");

        printNumbers(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}