///VIQ
//Q6 – Reverse an Array
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q6 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }

        //for swapping

        int start = 0;
        int end = n-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;

        }
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}