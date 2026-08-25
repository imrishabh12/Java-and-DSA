// Q4 - Print only odd numbers from 1 to n recursively.

package p3_level1_foundation_of_recursion;

import java.util.Scanner;

public class q4 {

    static void printOdd(int n) {

        if (n == 0) {
            return;
        }

        printOdd(n - 1);

        if (n % 2 != 0) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printOdd(n);
    }
}