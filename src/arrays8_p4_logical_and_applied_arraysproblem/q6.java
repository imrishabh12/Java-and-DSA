//Q6- Find the sum of all elements except the largest and smallest

package arrays8_p4_logical_and_applied_arraysproblem;
import java.util.Scanner;
public class q6 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int largest = arr[0];
        int smallest = arr[0];
        int sum = 0;
        for (int i=0; i<n; i++){
            if (arr[i] > largest){
                largest=arr[i];
            }

            if (arr[i] < smallest){
                smallest = arr[i];
            }
            sum = sum+arr[i];

        }

        System.out.println("largest element is : " + largest);
        System.out.println("smallest element is : " + smallest);
        System.out.println("the difference is : " +  (largest-smallest));
        System.out.println("sum of each element of array is : " + sum);
        System.out.println("sum except smallest and largest " + (sum - (largest+smallest)));
    }
}
