//vvviq

//Q5-find the element that appears exactly once in an array
package arrays6_p4_searching_and_counting_logic;
import java.util.Scanner;
public class q5 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size : ");
        int n= sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n;i++){
            System.out.print("eneter elemets");
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i<n; i++){
            boolean found =false;

            for (int j = 0; j < n; j++) {

                if (i != j && arr[i] == arr[j]) { ///very imp line
                    found = true;
                    break;
                }

            }
            if (!found){
                System.out.println("unqiue element is : ");
                System.out.println(arr[i]);
            }
        }

    }
}
