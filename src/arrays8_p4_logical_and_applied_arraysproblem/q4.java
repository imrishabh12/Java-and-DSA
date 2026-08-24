//Q4. Find the second smallest element in an array.
package arrays8_p4_logical_and_applied_arraysproblem;
import java.util.Scanner;
public class q4 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int smallest = arr[0];
        int secondSmallest = arr[0];
        for (int i = 1; i<n; i++){
            if (arr[i] < smallest){
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {//Because we want the second distinct smallest value
                secondSmallest = arr[i];

            }
        }
        System.out.println("second smallest element is : " + secondSmallest);
    }
}
