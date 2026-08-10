//VVVIIIQQQ

//Q2 – Create a New Array Containing Only Even Elements
package arrays6_p4_transformation_and_manipulation;
import java.util.Scanner;
public class q2 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //new array
        int[] arr2 = new int[n];
        int j = 0;// we need j when we know that new array might not get full

        //to store even num
        for (int i = 0; i<n; i++){
            if (arr[i] % 2 == 0){
                arr2[j] = arr[i];
                j++;
            }
        }
        //to print only stored elem in new array(even)
        for (int i = 0; i<j; i++){
            System.out.println(arr2[i]);//we wrote this bcz 2nd array is of 5 size and it has
                                        // less even num so for that we used this loop
                                            //that's y i have printed arr2[i] not arr2[j]
        }

    }
}