// Q6 - Print all numbers from 1-n whose binary representation has an even number of 1s.

package p2_level4_logical_loop_combinations;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            int temp = i;
            int count = 0;

            while (temp != 0) {

                if (temp % 2 == 1) {
                    count++;
                }

                temp = temp / 2;
            }

            if (count % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}