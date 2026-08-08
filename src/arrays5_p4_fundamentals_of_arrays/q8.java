//Find the Index of the Maximum Element
package arrays5_p4_fundamentals_of_arrays;

import java.util.Scanner;
public class q8 {

    static void main() {
        //cant take int max = arr[o] here bcz we have not entered array
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        // Loop 1: Take input
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Assume 1st elem is max  ->here its correct
        int max = arr[0];
        int maxIdx = 0;


        // Loop 2: Find maximum
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;

            }
        }


        System.out.println("idx of max elem is : " + maxIdx);

    }
}