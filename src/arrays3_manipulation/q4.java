//Ques))find the mode (most frequently occurring element) in an array.

package arrays3_manipulation;

public class q4 {

    public static void mode(int[] arr){
        int mode = arr[0];
        int maxCount=0;
        for (int i = 0; i<arr.length;i++){///        // Outer loop-- Pick one element

            int count =0; /// initialised in outer loop o/w counting will restart in every iteration
            for (int j=0; j<arr.length; j++){///            // Inner loop: Count frequency of arr[i]

                if (arr[i] == arr[j]){
                    count++;
                }
            }
            if (count>maxCount){
                maxCount = count;
                mode = arr[i];
            }
        }
        System.out.println("mode is : " + mode);
        System.out.println("max freq count is : " + maxCount);

    }


    static void main(){
        int[] arr = {3,4,5,4};
        mode(arr);

    }
}
