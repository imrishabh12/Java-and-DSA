//Question 7 – Factorial Using a Method
//
//Write a Java program that defines a method named factorial(int num).
//
//Requirements:
//1. The method should take an integer as a parameter.
//2. Calculate the factorial of the given number.
//3. Return the factorial.
//4. Call the method from main().
//5. Print the returned value.

package methods;

public class ques7 {
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact=fact*i;
        }
        return fact;
    }
    public static void main(String[] args){
        System.out.println(factorial(5));
    }

}
