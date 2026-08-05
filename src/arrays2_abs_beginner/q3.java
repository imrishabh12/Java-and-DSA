//Write a Java program to search for an element in an array using Linear Search.
//
//Requirements:
//1. Create an integer array.
//2. Search for a given element.
//3. If the element is found, print its index.
//4. Otherwise, print "Element not found".

package arrays2_abs_beginner;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args){
        int[] arr = {3,5,1,8,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num to search in the array : ");
        int target = sc.nextInt();
        boolean found = false;
        for (int i = 0; i< arr.length; i++){
            if(arr[i] == target){
                System.out.println("element found at : " + i);
                found = true;
                break;
            }
        }
        if (!found){
            System.out.println("elem not found");
        }
    }

}
