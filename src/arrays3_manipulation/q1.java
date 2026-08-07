/*
//reverse an array using simple tech
package arrays3_manipulation;
public class q1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
}

 */

//reverse an array using swapping
//-->in this we will use 2 pointer approach

package arrays3_manipulation;
public class q1 {


    public static void reverseArray(int arr[]){
        int n= arr.length;
        int i=0;
        int j=n-1;

        while(i < j){//will swap,i++, j--
            int temp=arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for (i=0; i<n ;i++){                      /// or for(int k : arr){
            System.out.println(arr[i]);           ///sout(k);
        }
    }public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverseArray(arr);
    }
}
