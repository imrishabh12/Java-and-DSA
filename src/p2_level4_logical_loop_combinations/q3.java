// Q3 - Print all numbers that are palindromes between 1-500.

package p2_level4_logical_loop_combinations;

public class q3 {
    public static void main(String[] args) {

        for (int i = 1; i <= 500; i++) {

            int temp = i;
            int reverse = 0;

            while (temp != 0) {

                int digit = temp % 10;

                reverse = reverse * 10 + digit;

                temp = temp / 10;
            }

            if (i == reverse) {
                System.out.print(i + " ");
            }
        }
    }
}