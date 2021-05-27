package algo.easy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static java.lang.Math.multiplyExact;

public class ReverseInteger {
    private static Logger LOGGER = LoggerFactory.getLogger("");

    public int reverse(int x) {
      int reverse = 0;
      try {
          while (x != 0) {
              int rem = x % 10;
             LOGGER.debug("Reminder: {}" , rem);
             LOGGER.debug("Before Reverse val: {} " , reverse);
              reverse = multiplyExact(reverse, 10) + rem;
             LOGGER.debug("After Reverse val: {}" , reverse);
              x = x / 10;
             LOGGER.debug("X: {}",  x);
          }
      }catch (ArithmeticException e){
         LOGGER.debug("ArithmeticException : {}" , e.getMessage());
          return 0;
      }
        return reverse;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
       LOGGER.info("Final Result: {}", reverseInteger.reverse(-123));
    }
}
