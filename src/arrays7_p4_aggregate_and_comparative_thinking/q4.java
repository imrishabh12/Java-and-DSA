//Q4: Find the common elements between two arrays

package arrays7_p4_aggregate_and_comparative_thinking;

import java.util.Scanner;

public class q4 {

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

        System.out.println("Common elements:");

        // Take every element from first array
        for (int i = 0; i < n; i++) {

            // Search for it in the second array
            for (int j = 0; j < n2; j++) {

                if (arr[i] == arr2[j]) {

                    // Common element found
                    System.out.print(arr[i] + " ");

                    // Stop searching for this element
                    break;
                }
            }
        }
    }
}