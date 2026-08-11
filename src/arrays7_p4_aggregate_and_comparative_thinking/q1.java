///VVVIIIQQQ

//Q1- Compare two arrays — check if they are equal (same elements & same order).


package arrays7_p4_aggregate_and_comparative_thinking;
import java.util.Scanner;
public class q1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i<n2; i++){
            arr2[i] = sc.nextInt();
        }

        boolean equal = true;
        if (n != n2){    ///we r checking size
            equal = false;
        }

        else {///so if size is same so now checking corrosp.. elements
            for (int i = 0; i<n2; i++){  ///we can use n or n2 whatever as size is same
                if (arr[i] != arr2[i]){
                    equal = false;
                    break;
                }
            }
        }
        if (equal){
            System.out.println("arrays are equal");

        }
        else {
            System.out.println("arrays are not equal");
        }
    }
}
