// Q7 - Print the sum of all even numbers up to n.

package p2_level1_basic_looping;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 2; i <= n; i = i + 2) {
            sum = sum + i;
        }

        System.out.println("Sum of even numbers = " + sum);
    }
}