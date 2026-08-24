//viq
//Q9- Print the frequency of each distinct element.
package arrays8_p4_logical_and_applied_arraysproblem;

import java.util.Scanner;

public class q9 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i]) {
                continue;
            }

            int count = 1;

            for (int j = i + 1; j < n; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " -> " + count);
        }
    }
}