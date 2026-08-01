//Question 4 – Parameters, Return Value
//
//Write a Java program that defines a method named add(int a, int b).
//
//Requirements:
//1. Take two integers as input from the user using Scanner in the main() method.
//2. Pass both numbers to the add(int a, int b) method.
//3. The add(int a, int b) method should return the sum of the two numbers.
//4. Store the returned value in a variable.
//5. Print the returned value.

package methods;
public class ques4 {
    public static int add(int a, int b){
        return a + b;
    }
    public static void main(String[] args){
        System.out.println(add(15,35));
    }
}
