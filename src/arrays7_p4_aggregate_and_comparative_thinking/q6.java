///VVVIIIQQQQ

// Q6 - Find elements present in second array but NOT in first array.

package arrays7_p4_aggregate_and_comparative_thinking;

import java.util.Scanner;

public class q6 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        // Input first array
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input second array
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Take every element from the SECOND array
        for (int i = 0; i < n2; i++) {

            // Initially assume current element is not found
            // in the first array.
            boolean found = false;

            // Search arr2[i] inside the FIRST array
            for (int j = 0; j < n; j++) {

                if (arr2[i] == arr[j]) {

                    // Element exists in first array
                    found = true;

                    // No need to search further
                    break;
                }
            }

            // If element was NOT found in first array,
            // print it.
            if (!found) {
                System.out.print(arr2[i] + " ");
            }
        }
    }
}