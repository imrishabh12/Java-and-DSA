// Q8 - Find nth Fibonacci number recursively.

package p3_level1_foundation_of_recursion;

import java.util.Scanner;

public class q8 {

    static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int result = fibonacci(n);

        System.out.println("Fibonacci number = " + result);
    }
}