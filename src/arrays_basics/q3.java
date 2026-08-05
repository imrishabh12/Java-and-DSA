package arrays_basics;

import java.util.Scanner;

public class q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // rows
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        //cols
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        // array creation
        int[][] arr = new int[rows][cols];

        // Input elements
        System.out.println("Enter the array elements:");

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                arr[i][j] = sc.nextInt();


            }
        }

        // Find the sum
        int sum = 0;

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                sum = sum + arr[i][j];

            }
        }

        // Print the result
        System.out.println("Sum = " + sum);
    }
}