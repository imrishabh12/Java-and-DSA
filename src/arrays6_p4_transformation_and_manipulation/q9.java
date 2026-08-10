//Q9 – Swap Alternate Elements
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q9 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        //logic to swap alternare
        for (int i = 0; i < n-1; i+=2){//i+=2 bcz we have to swap 1st with 2nd and then jump to 3rd to compare it with 4th
            int temp = arr[i];
            arr[i] = arr[i+1];
            arr[i+1] = temp;

        }
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }

}
