//Q3 – Replace All Negative Numbers with 0
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q3 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            if (arr[i] < 0){
                arr[i] = 0;
            }
            //System.out.println(arr[i]);//better to print seperately

        }
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
