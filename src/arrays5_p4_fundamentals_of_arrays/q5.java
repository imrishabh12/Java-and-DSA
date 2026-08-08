//Question 5 – Find the Minimum Element in an Array
package arrays5_p4_fundamentals_of_arrays;
import java.util.Scanner;
public class q5 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        //assume
        int min = arr1[0];
        for (int i = 1; i < n; i++){
            if (arr1[i] < min){
                min = arr1[i];
            }
        }
        System.out.println("min ele is : " + min);
    }
}
