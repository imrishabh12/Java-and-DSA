// Q7 - Print all prime numbers between 1 and 100.

package p2_level2_number_based_looping_logic;

public class q7 {
    public static void main(String[] args) {

        for (int n = 2; n <= 100; n++) {

            boolean isPrime = true;

            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(n + " ");
            }
        }
    }
}