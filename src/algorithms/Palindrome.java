package algorithms;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome2(-121));

    }
    static boolean isPalindrome2 (int x) {
    return false;
    }

    static boolean isPalindrome (int x) {

        int reversX = 0;
        int copyX = x;

        if (x < 0) {
            return false;
        }
        while (copyX > 0) {
            reversX = reversX * 10 + copyX % 10;
            copyX = copyX / 10;
        }

        return reversX == x;
    }
}
