// Q2 - Count how many numbers between 1-500 are divisible by 7 but not by 5.

package p2_level4_logical_loop_combinations;

public class q2 {
    public static void main(String[] args) {

        int count = 0;

        for (int i = 1; i <= 500; i++) {

            if (i % 7 == 0 && i % 5 != 0) {
                count++;
            }
        }

        System.out.println("Count = " + count);
    }
}