//Question 8 – Method Overloading
//
//Write a Java program that demonstrates method overloading by creating three methods named add().
//
//Requirements:
//
//1. Create the following methods:
//   - add(int a, int b)
//   - add(int a, int b, int c)
//   - add(double a, double b)
//
//2. Each method should return the sum of its parameters.
//
//3. Call all three methods from main().
//
//4. Print the returned values.

package methods;
public class ques8 {
    public static int add(int a, int b ){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;

    }
    public static double add(double a, double b){
        return a+b;
    }
    public static void main(String[] args){
        System.out.println(add(5,6));
        System.out.println(add(5,6,3));
        System.out.println(add(10.0,5.0));
    }
}
