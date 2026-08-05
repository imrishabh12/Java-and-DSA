//Write a Java program to find the average of all elements in an array
package arrays2_abs_beginner;

public class q1 {
    public static void main(String [] args){
        int[] arr1 = {1,2,3,4,5};
        int totaladd=0;
        for (int i=0; i< arr1.length;i++){
            int add = arr1[i];
            totaladd = totaladd + add;

        }
        double avg = totaladd/ arr1.length;

        System.out.println(avg);
    }
}
