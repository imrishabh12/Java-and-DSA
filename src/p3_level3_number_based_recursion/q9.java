// Q9 - Calculate the sum of first n odd numbers recursively.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q9 {

    static int sumOdd(int n) {

        if (n == 0) {
            return 0;
        }

        return (2 * n - 1) + sumOdd(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = sumOdd(n);

        System.out.println("Sum = " + sum);
    }
}