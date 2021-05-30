package algo.easy;

/*
* Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
*
* Constraints:

-2^31 <= x <= 2^31 - 1
*
* */
public class Palindrome {

    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        return reverse(x) == x;
    }

    private int reverse(int inputNum) {
        try {
            int reverse = 0;

            while (inputNum != 0) {
                int rem = inputNum % 10;
                reverse = Math.multiplyExact(reverse, 10) + rem;
                inputNum = inputNum / 10;
            }
            return reverse;
        } catch (ArithmeticException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.isPalindrome(-121));
    }
}
