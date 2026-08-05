//Finding the maximum value in a 2D Array
package arrays_basics;

public class q4 {
    public static void main(String[] args){
        int[][] arr= {
                {3,2,7},
                {6,1,9}
        };
        int max = arr[0][0];
        for (int i = 0;  i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++){    ////very imp
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }

        }
        System.out.println("max is : " + max );
    }
}





//same question by taking user i/p
/*
package arrays;

import java.util.Scanner;

public class q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rows and columns
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // Create 2D array
        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter the array elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Assume first element is maximum
        int max = arr[0][0];

        // Find maximum element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
        }

        // Print result
        System.out.println("Maximum element = " + max);
    }
}
*/
