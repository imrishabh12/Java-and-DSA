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
/*
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


 */






//Q7)Write a Java program to calculate the factorial of a given number.
/*
package loops;
import java.util.*;

public class for_loop {
    public static void main(String[] args) {
        int fact = 1;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }
}
*/











//Q8))Write a Java program to count how many numbers from 1 to 100 (both inclusive) are divisible by 3
/*
package loops;

public class for_loop {
    public static void main(String[] args){
        int count =0;
        for(int i=1;i<=100; i++){
            if (i%3 == 0) {
                count++;
            }
        }
        System.out.println(count);

    }
}


 */














//Q9))Write a Java program to determine whether a given number is prime or not using a for loop
/*
package loops;
import java.util.*;

public class for_loop{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                }
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
    }
}
*/













//Q10)

//Print the first 10 Fibonacci numbers
package loops;
import java.util.*;

public class for_loop {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        System.out.print(first + " " + second + " ");
        for (int i = 3; i <= 10; i++) {
            int next = first + second;
            System.out.print(next + " ");

            first = second;
            second = next;
        }
    }
}



