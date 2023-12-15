package algorithms;

public class TheLargestDivisor {
    public static void main(String[] args) {

        System.out.println(divisor(3, 9));


    }

    public static int divisor(int a, int b) {

        if (a == 0) return b;
        if (b == 0) return a;
        int res = a % b;
        return divisor(b, res);
    }
}
