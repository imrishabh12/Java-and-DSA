//Q8- Count how many elements are greater than the average of the array
package arrays8_p4_logical_and_applied_arraysproblem;
import java.util.Scanner;
public class q8 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i=0; i<n; i++){
            sum=sum+arr[i];
        }
        double avg = (double) sum/n;
        System.out.println("average is :" + avg);
        int count = 0;
        for (int i =0; i<n; i++){
            if (arr[i] > avg){
                count++;
            }
        }
        System.out.println("count of elem greater than avg : " + count);
    }
}

