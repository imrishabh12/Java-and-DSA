//Ques)Write a Java program to print the extreme elements of an array in an alternate manner
//Example 1      Input:int[] arr = {1, 2, 3, 4, 5}            Output:1 5 2 4 3


package arrays3_manipulation;
public class q3 {
    static void alterElem(int[] arr){
        int n= arr.length;
        int i = 0;
        int j = n-1;
        while(i<=j){
            if (i==j){
                System.out.println(arr[i]);
                return;
            }
            else{  //i<j
                System.out.println(arr[i]);
                i++;
                System.out.println(arr[j]);
                j--;
            }
        }

    }
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        alterElem(arr);

    }
}
