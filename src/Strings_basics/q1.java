//Q1-Take a string input and print its length.

package Strings_basics;
import java.util.Scanner;
public class q1 {
    static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter any string : ");
        String str1 = sc.next();
        int length = str1.length();
        System.out.println("the length of the i/p string is : " +length);
    }
}
