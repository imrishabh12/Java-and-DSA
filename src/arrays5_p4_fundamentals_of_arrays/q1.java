//Input n and take n integers into an array; print them.
package arrays5_p4_fundamentals_of_arrays;
import java.util.Scanner;

public class q1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<size;i++){
            System.out.println(arr[i]);
        }

    }

}
