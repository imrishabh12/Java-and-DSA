//Question 5 – Find Maximum
//
//Write a Java program that defines a method named findMax(int a, int b).
//
//Requirements:
//1. Take two integers as input from the user using Scanner in the main() method.
//2. Pass both numbers to the findMax(int a, int b) method.
//3. The method should return the larger of the two numbers.
//4. Store the returned value in a variable.
//5. Print the returned value.

package methods;
public class ques5 {
    public static int findMax(int a, int b){
        if(a>b){
            return a;

        }
        else {
            return b;
        }
    }
    public static void main(String[] args){
        System.out.println(findMax(25,18));
    }
}
