//viq
//Q3. Find the second largest element in an array.
package arrays8_p4_logical_and_applied_arraysproblem;
import java.util.Scanner;

public class q3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int secondlargest = arr[0];
        for (int i =1; i<n; i++){
            if (arr[i] > largest){
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {///viline
                secondlargest = arr[i];

            }

        }
        System.out.println("second largest is : " + secondlargest);
    }
}

/*
//Q3. Find the second largest element in an array.
package arrays8_p4_logical_and_applied_arraysproblem;

import java.util.Arrays;
import java.util.Scanner;

public class q3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Second largest element: " + arr[n - 2]);
    }
}

 */