//Write a Java program to multiply every element of an array by 10
package arrays2_abs_beginner;

public class q2 {
    public static void main(String [] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] * 10;//mul each by 10
        }
        //printing updated
        for(int i=0;i< arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
