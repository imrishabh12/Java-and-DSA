// Q2 - Print all even numbers between 1 and 100.

package p2_level1_basic_looping;

public class q2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}