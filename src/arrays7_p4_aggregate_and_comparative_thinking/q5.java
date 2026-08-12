///vviq

// Q5 - Find elements present in first array but NOT in second array.

package arrays7_p4_aggregate_and_comparative_thinking;

import java.util.Scanner;

public class q5 {

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

        // Check every element of first array
        for (int i = 0; i < n; i++) {

            // Initially assume current element is not found
            boolean found = false;

            // Search current element inside second array
            for (int j = 0; j < n2; j++) {

                if (arr[i] == arr2[j]) {

                    // Element exists in second array
                    found = true;

                    // No need to search further
                    break;
                }
            }

            // If element was NOT found in second array
            if (!found) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}