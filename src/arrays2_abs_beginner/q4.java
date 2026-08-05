//find the sum of positive numbers and the sum of negative numbers in an array
package arrays2_abs_beginner;

public class q4 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, -8, -5, -9};
        int possum = 0;
        int negsum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                possum = possum + arr[i];
            } else {
                negsum = negsum + arr[i];
            }
        }
        System.out.println(possum);
        System.out.println(negsum);
    }
}



