//Question 1 – No Parameters, No Return Value
//
//Write a method named greet() that prints:
//
//Welcome to Java
//
//Call the method from main().
package methods;
public class firstprog {

public void greet(){
    System.out.println("Welcome to Java");
}

    public static void main(String[] args) {
        firstprog ob1 = new firstprog();// as ive not used static so that's y ive created its object
        ob1.greet();

    }
}
