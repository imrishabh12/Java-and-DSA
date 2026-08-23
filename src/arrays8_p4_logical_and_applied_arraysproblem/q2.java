//Q2. Check if the array is sorted in descending order.
package arrays8_p4_logical_and_applied_arraysproblem;
import java.util.Scanner;

public class q2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i<n-1; i++){
            if (arr[i] < arr[i+1]){
                System.out.println("not in descending order");//cant check arr[i]>arr[i+1] here
                return;
            }
        }
        System.out.println("yes it is in descending order");
    }
}