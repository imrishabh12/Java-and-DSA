//Q2 – Smallest Element
package arrays4_stage1_traversal;

public class q2 {
    static void main(String[] args){
        int[] arr = {23,13,3,8};
        int smallest = arr[0];
        for (int i = 1; i<arr.length;i++){//bcz oth idx is already assumed
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        System.out.println("smallest element is : " + smallest);
    }
}
