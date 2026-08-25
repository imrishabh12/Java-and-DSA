// Q9 - Print Fibonacci series up to n terms recursively.

package p3_level1_foundation_of_recursion;

import java.util.Scanner;

public class q9 {

    static void fibonacci(int first, int second, int n) {

        if (n == 0) {
            return;
        }

        System.out.print(first + " ");

        fibonacci(second, first + second, n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        fibonacci(0, 1, n);
    }
}