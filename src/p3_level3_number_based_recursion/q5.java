// Q5 - Find GCD (HCF) of two numbers using Euclid's algorithm recursively.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q5 {

    static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }

        return gcd(b, a % b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int result = gcd(a, b);

        System.out.println("GCD = " + result);
    }
}