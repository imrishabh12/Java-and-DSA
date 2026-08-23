// Q1 - Print all numbers whose sum of digits is even (1-100).

package p2_level4_logical_loop_combinations;

public class q1 {
    public static void main(String[] args) {

        for (int n = 1; n <= 100; n++) {

            int temp = n;
            int sum = 0;

            while (temp != 0) {
                int digit = temp % 10;
                sum = sum + digit;
                temp = temp / 10;
            }

            if (sum % 2 == 0) {
                System.out.print(n + " ");
            }
        }
    }
}