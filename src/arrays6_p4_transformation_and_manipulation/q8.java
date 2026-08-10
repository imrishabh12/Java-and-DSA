//Q8 – Rotate an Array by One Position to the Right
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q8 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[n-1];//s1)saved last elem

        for (int i = n-1; i>0; i--){
            arr[i] = arr[i-1];//s2) sfifting right
        }
        arr[0] = temp;//s3)last elem to first

        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

}
