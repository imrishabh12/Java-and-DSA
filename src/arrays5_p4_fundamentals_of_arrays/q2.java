//q2-  Find the Sum of All Elements in an Array
package arrays5_p4_fundamentals_of_arrays;
import java.util.Scanner;

public class q2 {
    static void main(){
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];


        }
        /*for (int i = 0; i<size;i++){
            sum = sum + arr[i];
        }*/

        System.out.println(sum);//to print sum


    }

}
