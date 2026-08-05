//Question 6 – Find the First Unsorted Element in an Array
//Requirements:
//1. Traverse the array.
//2. Compare each element with the next element.
//3. If an element is greater than the next element, print that element and stop.
//4. If the array is completely sorted, print "Array is sorted".

package arrays2_abs_beginner;
public class q6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 8, 5, 6};
        boolean sorted = true;
        for (int i = 0;i< arr.length-1;i++){
            if (arr[i] > arr[i+1]){
                System.out.println("we found first unsorted i.e, : " + arr[i]);
                sorted = false;
                break;
            }
        }
        if(sorted){
            System.out.println("array is sorted");
        }
    }
}
