// Q8 - Calculate the sum of first n even numbers recursively.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q8 {

    static int sumEven(int n) {

        if (n == 0) {
            return 0;
        }

        return (2 * n) + sumEven(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = sumEven(n);

        System.out.println("Sum = " + sum);
    }
}