//finding sum of all elements in an array
/*
package arrays;
public class q1 {
    public static void main(String[] args){
        int sum =0;
        int arr[] = {2,7,5,4,3};
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }
}
*/


//solving same question in diff style
package arrays_basics;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int size = sc.nextInt();

        int arr[] = new int[size];//array creation
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(sum);
    }
}
