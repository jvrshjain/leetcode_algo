package algo.easy;

/*
* Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.

Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given a roman numeral, convert it to an integer
*
* Constraints:

1 <= s.length <= 15
s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
It is guaranteed that s is a valid roman numeral in the range [1, 3999].
*
* */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

public class RomanToInt {
    private static Logger LOGGER = LoggerFactory.getLogger("");


    //solution using Streams
    /*public int romanToInt(String s) {
            return Arrays.stream(s
                    .replace("IV", "4 ")
                    .replace("IX", "9 ")
                    .replace("XL", "40 ")
                    .replace("XC", "90 ")
                    .replace("CD", "400 ")
                    .replace("CM", "900 ")
                    .replace("I", "1 ")
                    .replace("V", "5 ")
                    .replace("X", "10 ")
                    .replace("L", "50 ")
                    .replace("C", "100 ")
                    .replace("D", "500 ")
                    .replace("M", "1000 ")
                    .trim()
                    .split(" "))
                    .map(Integer::valueOf)
                    .reduce(0, Integer::sum);
    }*/

    public Map<Character, Integer> romanNotations = new HashMap<Character, Integer>(){
        {
            put('I',1);
            put('V', 5);
            put('X', 10);
            put('L', 50);
            put('C', 100);
            put('D', 500);
            put('M', 1000);
        }
    };

    //Using HashMap
    public int romanToInt(String s) {
        if (s == null) {
            return 0;
        }
        int  sum = romanNotations.get(s.charAt(s.length()-1));
        for (int i=s.length()-2; i >=0 ; i--){
            if(romanNotations.get(s.charAt(i)) >= romanNotations.get(s.charAt(i+1))){
                sum = sum + romanNotations.get(s.charAt(i));
            }else {
                sum = sum - romanNotations.get(s.charAt(i));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        RomanToInt romanToInt = new RomanToInt();
        String s = "MCMXCVI";
        LOGGER.info("Input : {} and OutPut : {}",s, romanToInt.romanToInt(s));
    }
}
