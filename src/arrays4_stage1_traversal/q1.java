//Question 1: Largest Element in an Array
package arrays4_stage1_traversal;

public class q1 {
    static void main(String[] args){
        int[] arr = {1,13,3,8};
        int largest = arr[0];
        for (int i = 1; i<arr.length;i++){//bcz oth idx is already assumed
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        System.out.println("largest element is : " + largest);
    }
}
