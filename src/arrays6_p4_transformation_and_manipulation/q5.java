//Q5– Swap First and Last Elements of an Array
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q5 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        //for (int i=0; i<n; i++){///we dont need this as we dont need to traverse every element
            //logic to swap first idx and last idx element
            int temp = arr[0];
            arr[0] = arr[n-1];
            arr[n-1] = temp;

        //}
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}