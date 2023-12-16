package algorithms;

public class PrimeNumbers {
    public static void main(String[] args) {

        int count = 100;

    primeNumbers(count);
    }

    static void primeNumbers(int count) {

        int k;
        for (int i = 1; i <= count; i++) {
            k = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.println(i);
            }
        }
    }
}
