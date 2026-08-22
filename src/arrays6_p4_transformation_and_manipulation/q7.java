//viq
//Q7 – Rotate an array by one position to the left.
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q7 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];//s1)saved first elem

        for (int i = 0; i<n-1; i++){
            arr[i] = arr[i+1];//s2) sfifting left
        }
        arr[n-1] = temp;//s3)first elem to last




        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}