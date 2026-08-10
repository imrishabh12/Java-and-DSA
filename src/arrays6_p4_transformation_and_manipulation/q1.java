//Q1 – Create a New Array Containing Squares of All Numbers
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int[] arr2 = new int[n];
        for (int i = 0; i<n; i++){
            arr2[i] = arr[i]*arr[i];
        }
        for (int i =0; i<n; i++){
            System.out.println(arr2[i]);
        }

    }
}
