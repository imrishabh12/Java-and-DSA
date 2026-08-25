// Q5 - Print sum of first n natural numbers recursively.

package p3_level1_foundation_of_recursion;

import java.util.Scanner;

public class q5 {

    static int sumNatural(int n) {

        if (n == 0) {
            return 0;
        }

        return n + sumNatural(n - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = sumNatural(n);

        System.out.println("Sum = " + sum);
    }
}