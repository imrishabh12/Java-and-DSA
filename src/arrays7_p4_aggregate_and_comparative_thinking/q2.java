///VVVVIIIQQQQ

//Q2-Check if two arrays contain the same elements, but order doesn't matter.

//bcz duplicates can exist,we need to make sure an elem from the 2nd array isn't used more than once

//algorithm for this
//1. Check whether sizes are equal.
//       ↓
//2. Take one element from arr.
//       ↓
//3. Search for that element anywhere in arr2.
//       ↓
//4. If found:
//       Mark that arr2 element as USED.
//       ↓
//5. Move to the next element of arr.
//       ↓
//6. If any element cannot be found:
//       Arrays are NOT equal.
//       ↓
//7. If every element is found:
//       Arrays ARE equal.

package arrays7_p4_aggregate_and_comparative_thinking;

import java.util.Scanner;

public class q2 {

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

        // Assume arrays are equal initially
        boolean equal = true;

        // If sizes are different, arrays cannot contain the same elements
        if (n != n2) {

            equal = false;

        } else {//now means arrays are of equal size

            // Keeps track of which elements of arr2 have already been used
            boolean[] visited = new boolean[n2];//If we didn't have visited, we could accidentally use the same 1 in arr2 twice.

            // Take each element of arr one by one
            for (int i = 0; i < n; i++) {

                // Assume current arr[i] has not been found
                boolean found = false;

                // Search for arr[i] inside arr2
                for (int j = 0; j < n2; j++) {

                    // Check:
                    // 1. Elements are equal
                    // 2. This arr2 element has not already been used
                    if (arr[i] == arr2[j] && !visited[j]) {

                        // We found a matching element
                        found = true;

                        // Mark this arr2 element as used
                        visited[j] = true;

                        // No need to search further for this arr[i]
                        break;//if we found arr1 in arr2 then no need to search it now move to next i of arr1
                    }
                }

                // If arr[i] couldn't be found in arr2
                if (!found) {

                    equal = false;

                    // No need to check remaining elements
                    break;
                }
            }
        }

        // Final result
        if (equal) {
            System.out.println("Arrays are equal");
        } else {
            System.out.println("Arrays are not equal");
        }
    }
}