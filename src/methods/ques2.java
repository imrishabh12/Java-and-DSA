//Question 2 – Parameters, No Return Value
//
//Write a Java program that defines a method named printSquare(int num).
//
//Requirements:
//1. Take an integer input from the user using Scanner in the main() method.
//2. Pass the input value to the printSquare(int num) method.
//3. The printSquare(int num) method should print the square of the given number.
//4. The method should not return any value (void).
package methods;
import java.util.Scanner;
public class ques2 {
    public static void printSquare(int num){
        System.out.println(num*num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number : ");
        int num = sc.nextInt();
        printSquare(num);//vip while calling we dont pass return type
    }

}
