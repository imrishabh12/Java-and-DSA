//vviq
// Q1 Search an Element in an Array (Linear Search)

package arrays6_p4_searching_and_counting_logic;
import java.util.Scanner;
public class q1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter elements: ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        boolean found = false;      // Initially assume element is not found
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                System.out.println("Element found at index: " + i);
                found = true;       // Element found
                break;              // Stop searching
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
}