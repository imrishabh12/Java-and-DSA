// Q9 - Print the factorial of a given number.

package p2_level1_basic_looping;

import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        System.out.println("Factorial = " + factorial);
    }
}