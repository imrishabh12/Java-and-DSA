//Q)) Right shift array by 1 position
//not we cant move left to right bcz we will loose i+1 value


package arrays3_manipulation;
public class q2 {
    static void shiftby1(int[] arr){
        //step1-> store last value in temp
        //s2--> shift  value
        //s3--> now put temp value at idx 0
        int n= arr.length;
        int temp = arr[n-1]; //s1
        for (int i=n-1; i>0; i--){//s2
            arr[i] = arr[i-1];
        }
        arr[0]= temp;


    }


    public static void main(String[] args){
        int arr[] = {3,5,4,1,2};
        shiftby1(arr);

        for(int k:arr){
            System.out.println(k + " ");
        }
    }
}
