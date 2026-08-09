// Q6 - Print all the elements that appear more than once in an array.

package arrays6_p4_searching_and_counting_logic;

import java.util.Scanner;

public class q6 {

    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements: ");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {

            // Step 1: Check if already printed
            boolean alreadyPrinted = false;

            for (int k = 0; k < i; k++) {

                if (arr[i] == arr[k]) {
                    alreadyPrinted = true;
                    break;
                }

            }

            // Step 2: Skip if already printed
            if (alreadyPrinted) {
                continue;
            }

            // Step 3: Check for duplicate ahead
            boolean duplicate = false;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }

            }

            if (duplicate) {
                System.out.println(arr[i]);
            }

        }

    }

}