//Count Positive, Negative and Zero Elements
package arrays5_p4_fundamentals_of_arrays;
import java.util.Scanner;
public class q6 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }
        int posCount = 0;
        int negCount = 0;
        int zeroCcount = 0;
        for (int i = 0; i < n; i++) {
            if (arr1[i] > 0) {
                posCount++;
            } else if (arr1[i] < 0) {
                negCount++;
            } else if (arr1[i] == 0) {
                zeroCcount++;
            }
        }
        System.out.println(posCount);
        System.out.println(negCount);
        System.out.println(zeroCcount);
    }
}
