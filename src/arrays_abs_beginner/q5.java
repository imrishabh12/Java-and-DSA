//count the number of 0s and 1s in an array
package arrays_abs_beginner;

public class q5 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 0, 1, 0,1,0,1,1,0};
        int ones = 0;
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            } else if (arr[i] == 1){
                ones++;
            }
        }
        System.out.println(zeroes);
        System.out.println(ones);
    }
}
