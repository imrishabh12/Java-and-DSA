package arrays3_manipulation;


public class q1 {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Traverse from last index to first index
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}