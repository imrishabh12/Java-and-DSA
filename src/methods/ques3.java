//Question 3 – No Parameters, Return Value
//
//Write a Java program that defines a method named getNumber().
//
//Requirements:
//1. Create a method named getNumber() that takes no parameters.
//2. The method should return the integer 100.
//3. Call the getNumber() method from the main() method.
//4. Store the returned value in a variable and print it.
package methods;

public class ques3 {
    public static int getNumber(){
        return 100;
    }
    public static void main(String[] args){
        int num = getNumber();
        System.out.println(num);
    }
}
