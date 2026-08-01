//Question 6 – Even or Odd
//
//Write a Java program that defines a method named isEven(int num).
//
//Requirements:
//1. The method should return true if the number is even.
//2. Otherwise, it should return false.
//3. Call the method from main().
//4. Print the returned value.
package methods;
import java.util.*;
public class ques6 {
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(isEven(num));
    }
}
//or
/*
package methods;
import java.util.*;
public class ques6 {
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.println(isEven(num));
    }
}
*/