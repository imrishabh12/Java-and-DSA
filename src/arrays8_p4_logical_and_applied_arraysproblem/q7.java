//viq
//Q7- Count how many pairs of elements have a sum equal to a given number k
//eg {2,4,3,5,7}
//2+5 = 7
//4+3 = 7
//o/p is 2
package arrays8_p4_logical_and_applied_arraysproblem;
import java.util.Scanner;
public class q7 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements of array : ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter the number K: ");
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i<n; i++){
            for (int j = i+1; j<n; j++){//j+1 so that same pair doesn't counted 2 times
                if (arr[i] + arr[j] == k){
                    count++;

                }
            }
        }
        System.out.println("the count is : " + count);
    }
}
