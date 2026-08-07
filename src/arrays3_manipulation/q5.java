//Question – Find the Element with Highest and Lowest Frequency
package arrays3_manipulation;

public class q5{

    public static void freqCount(int[] arr){
        int minCount= arr.length;
        int maxCount=0;

        int minElement=arr[0];
        int maxElement = arr[0];

        for (int i = 0; i<arr.length;i++){

            int count =0;
            for (int j=0; j<arr.length; j++){

                if (arr[i] == arr[j]){
                    count++;
                }
            }
            // Update highest frequency
            if (count>maxCount){
                maxCount = count;
                maxElement= arr[i];
            }
            //now update lowest frequency
            if (count < minCount){
                minCount = count;
                minElement = arr[i];
            }
        }
        System.out.println("max freq elem count is : " + maxCount);
        System.out.println("max freq element is : " + maxElement);

        System.out.println("min freq elem is : " + minCount);
        System.out.println("min freq elem count is : " + minElement);

    }


    static void main(){
        int[] arr = {3,4,5,4,3,4};
        freqCount(arr);

    }
}