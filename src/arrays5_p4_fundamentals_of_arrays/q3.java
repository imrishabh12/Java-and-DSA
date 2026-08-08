//Q3 – Find the Average of All Elements in an Array
package arrays5_p4_fundamentals_of_arrays;
import java.util.Scanner;

public class q3 {
    static void main(){
        int sum =0;
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i=0; i<size; i++){
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
            //avg = sum/size; /// not cal avg here first add all then avg it will reduce work
        }
        double avg = (double) sum/size;
        System.out.println(sum);//to print sum
        System.out.println(avg);// to print avg
    }
}