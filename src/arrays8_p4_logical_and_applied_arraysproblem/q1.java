//viq
//Q1. Check if the array is sorted in ascending order.
package arrays8_p4_logical_and_applied_arraysproblem;
import java.util.Scanner;

public class q1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i =0; i<n-1; i++){
            if (arr[i]>arr[i+1]){
                System.out.println("no its not in ascending order");
                return;
            }

        }
        System.out.println("Yes, its in ascending order");
    }
}
/*
//Q1. Check if the array is sorted in ascending order.
package arrays8_p4_logical_and_applied_arraysproblem;

import java.util.Scanner;

public class q1 {
    static void main(){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        boolean sorted = true;

        for (int i = 0; i < n - 1; i++){

            if (arr[i] > arr[i + 1]){
                sorted = false;
                break;
            }
        }

        if (sorted){
            System.out.println("yes its in ascending order");
        }
        else {
            System.out.println("not in ascending order");
        }
    }
}
 */