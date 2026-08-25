// Q3 - Print only even numbers from 1 to n recursively.

package p3_level1_foundation_of_recursion;

import java.util.Scanner;

public class q3 {

    static void printEven(int n) {

        if (n == 0) {
            return;
        }

        printEven(n - 1);

        if (n % 2 == 0) {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        printEven(n);
    }
}