// Q3 - Merge two arrays into a single array.

package arrays7_p4_aggregate_and_comparative_thinking;
import java.util.Scanner;
public class q3 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();//size for creating 1st array
        int[] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();//size for creating 2nd array
        int[] arr2 = new int[x];
        for (int i = 0; i<x ; i++){
            arr2[i] = sc.nextInt();
        }

        int[] mergedarr = new int[n + x];//creating merge of size 1st array + 2nd array

        //Copy 1st array elem into merged array
        for (int i=0; i<n; i++){
            mergedarr[i] = arr[i];
        }

        //Copy elem of 2nd array after the elements of 1st array
        for (int i = 0; i<x; i++){
            mergedarr[n + i] = arr2[i];
        }

        //printing final merged array
        for (int i = 0; i<mergedarr.length; i++){
            System.out.println( mergedarr[i] + " ");
        }
    }
}
