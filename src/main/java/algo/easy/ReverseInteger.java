package algo.easy;

import static java.lang.Math.multiplyExact;

public class ReverseInteger {

    public int reverse(int x) {
      int reverse = 0;
      try {
          while (x != 0) {
              int rem = x % 10;
              System.out.println("Reminder: " + rem);
              System.out.println("Before Reverse val: " + reverse);
              reverse = multiplyExact(reverse, 10) + rem;
              System.out.println("After Reverse val: " + reverse);
              x = x / 10;
              System.out.println("X: " + x);
          }
      }catch (ArithmeticException e){
          System.out.println("ArithmeticException : " + e.getMessage());
          return 0;
      }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.println("Final Result: "+reverseInteger.reverse(-123));
    }
}
