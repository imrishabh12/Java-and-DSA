// Q1 - Print numbers from 1 to n using recursion.

package p3_level1_foundation_of_recursion;

import java.util.Scanner;

public class q1 {

    static void printNumbers(int n) {

        if (n == 0) {
            return;
        }

        printNumbers(n - 1);

        System.out.print(n + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printNumbers(n);
    }
}