package algo.easy;

import java.util.HashSet;

public class HappyNumber {
    HashSet<Integer> hs=new HashSet<Integer>();

    public static void main(String[] args) {
        //Given input integer
        int input = 2;
        HappyNumber happyNumber = new HappyNumber();
        System.out.println(happyNumber.isHappy(input));
    }
    public boolean isHappy(int n) {
    //validate if it is positive integer
        if(n > 0) {
            int result = findHappyNumber(n);
            while (result > 1) {
                result = findHappyNumber(result);
            }
            System.out.println(result == 1 ? "Happy Number :) " : "Not a Happy Number :( ");
            return result == 1;
        } else {
            System.out.println("Input is not a positive Integer");
            return false;
        }
    }


    private int findHappyNumber(int input) {
        String number = String.valueOf(input);
        int sum=0;
        if(hs.contains(input)){
            return sum;
        }
        hs.add(input);
        String[] digits = number.split("(?<=.)");
        for (String digit : digits) {
            sum += (int) Math.pow(Integer.parseInt(digit), 2);
        }
        System.out.println(sum);
        return sum;
    }

    public boolean isHappy1(int n) {
        if (n == 1) {
            return true;
        }
        if (hs.contains(n)) {
            return false;
        }
        hs.add(n);
        int nn = 0;
        while (n > 0) {
            int r = n % 10;
            n = n / 10;

            nn += Math.pow(r, 2);
        }
        if (nn == 1) {
            return true;
        }
        boolean ans = isHappy(nn);
        return ans;
    }
}
