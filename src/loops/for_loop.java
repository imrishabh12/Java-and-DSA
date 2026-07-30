//Q1))Write a Java program to print numbers from 1 to 10 using a for loop.
/*
package loops;

public class for_loop {
    public static void main(String[] args){
        for(int i=1;i<=10; i++){
            System.out.println(i);
        }

    }
}


 */







//Q2))Write a Java program to print numbers from 10 to 1 using a for loop
/*
package loops;

public class for_loop {
    public static void main(String[] args){
        for(int i=10;i>=1; i--){
            System.out.println(i);
        }

    }
}

 */










//Q3))Write a Java program to print all even numbers between 1 and 50 using a for loop
/*
package loops;

public class for_loop {
    public static void main(String[] args){
        for(int i=1;i<50; i++){
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

    }
}

 */









//Q4))Write a Java program to print all odd numbers from 1 to 50 (both inclusive) using a for loop
/*
package loops;

public class for_loop {
    public static void main(String[] args){
        for(int i=1;i<=50; i++){
            if (i%2 != 0) {
                System.out.println(i);
            }
        }

    }
}

 */














//Q5))Write a Java program to calculate the sum of numbers from 1 to N (both inclusive).
/*
package loops;
import java.util.*;

public class for_loop {
    public static void main(String[] args){
        int sum=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=num; i++){
            sum = sum+i;    //sum+=i
        }
        System.out.println(sum);
    }
}

 */












//Q6))Write a Java program to print the multiplication table of a given number from 1 to 10.

package loops;
import java.util.*;

public class for_loop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(num + "x" + i + "=" + (num*i));
        }
    }
}














