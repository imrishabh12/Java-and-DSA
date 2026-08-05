//Question 2 – Find the Maximum Element in an Array
package arrays1_basics;

public class q2 {
    public static void main(String[] args) {
        int arr[] = {2, 7, 5, 4, 9};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }

}
