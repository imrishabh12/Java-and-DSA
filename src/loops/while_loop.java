//Q1)Write a Java program to print numbers from 1 to 10 using a while loop
/*
package loops;
public class while_loop {
    static void main(){
        int num =1;
        while(num<=10){
            System.out.println(num);
            num++;
        }
    }
}
 */










//Q2))Write a Java program to reverse a number using a while loop.
/*
package loops;

import java.util.Scanner;

public class while_loop {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to reverse: ");
        int num = sc.nextInt();
        int rev=0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
            //num++;
        }
        System.out.println(rev);
    }
}
 */









//Q3))Write a Java program to count the number of digits in a given number using a while loop
/*
package loops;
public class while_loop {
    static void main() {
        int count = 0;
        int num = 56788983;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}

 */










//Q4) Write a Java program to check whether a given number is a palindrome using a while loop
package loops;
import java.util.*;
public class while_loop {
    static void main(){
        int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number to check: ");
        int num = sc.nextInt();
        int pal = num;
        while (num>0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if(rev == pal){
            System.out.println("yes its a palindrome");
        }
        else {
            System.out.println("not a palindrome");
        }
    }
}

