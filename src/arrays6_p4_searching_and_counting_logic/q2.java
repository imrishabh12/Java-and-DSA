//viq
//Q2-Write a Java program to count how many times a given element appears in an array.
package arrays6_p4_searching_and_counting_logic;
import java.util.Scanner;
public class q2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to count occurance : ");
        int x = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                count++;
            }
        }
        System.out.println("element count is : " + count);
    }
}