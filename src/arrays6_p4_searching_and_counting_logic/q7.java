// Q7 - Print all the elements that appear exactly once in an array.

package arrays6_p4_searching_and_counting_logic;

import java.util.Scanner;

public class q7 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements: ");
            arr[i] = sc.nextInt();
        }

        // Check every element
        for (int i = 0; i < n; i++) {

            boolean duplicate = false;

            // Compare current element with every other element
            for (int j = 0; j < n; j++) {

                if (i != j && arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }

            }

            // Print only if no duplicate exists
            if (!duplicate) {
                System.out.println(arr[i]);
            }

        }

    }

}