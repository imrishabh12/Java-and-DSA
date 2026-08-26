// Q10 - Find nCr (Combination formula) recursively using Pascal's relation.

package p3_level3_number_based_recursion;

import java.util.Scanner;

public class q10 {

    static int nCr(int n, int r) {

        if (r == 0 || r == n) {
            return 1;
        }

        return nCr(n - 1, r - 1) + nCr(n - 1, r);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        int result = nCr(n, r);

        System.out.println("nCr = " + result);
    }
}