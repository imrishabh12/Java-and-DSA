//Q4– Replace Even Numbers with 1 and Odd Numbers with 0
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q4 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0 ;i < n; i++){
            arr[i] = sc.nextInt();
        }
        for (int i=0; i<n; i++){
            if (arr[i] % 2 == 0){
                arr[i] = 1;
            }
            else {
                arr[i] = 0;
            }
            //System.out.println(arr[i]);//better to print seperately

        }
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
    }
}
//TC i/p - o(n) processing- o(n)  printing- o(n) total 0(n+n+n) = o(n)
//SC - o(1)
