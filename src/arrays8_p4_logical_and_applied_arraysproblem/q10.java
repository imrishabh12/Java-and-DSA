//Q10- Print all unique elements - elements occurring exactly once.
package arrays8_p4_logical_and_applied_arraysproblem;

import java.util.Scanner;

public class q10 {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("unique elements are : ");

        for (int i = 0; i < n; i++) {

            int count = 0;

            for (int j = 0; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[i]);
            }
        }
    }
}