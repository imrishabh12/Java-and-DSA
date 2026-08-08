//Print Elements Greater Than k
//Write a Java program to:
//Read n.
//Read n integers into an array.
//Read another integer k.
//Print all elements greater than k.
package arrays5_p4_fundamentals_of_arrays;
import java.util.Scanner;
public class q9 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        //read another int k
        int k = sc.nextInt();
        for (int i = 0; i<n; i++){
            if (arr[i] > k){
                System.out.println(arr[i]);
            }
        }
    }
}
