package algo.easy;
/*Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Output: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
*/


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    private static final Logger LOGGER = LoggerFactory.getLogger(TwoSum.class);

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> tempMap = new HashMap<Integer, Integer>();
        int[] result = new int[0];

        for (int i = 0; i <= nums.length - 1; i++) {
            tempMap.put(nums[i], i);
        }

        LOGGER.info("Tmp Map {}", tempMap);

        for (int i = 0; i <= nums.length - 1; i++) {
            int secElement = target - nums[i];
            LOGGER.debug("First Element: {} Second Element to find : {}", nums[i], secElement);
            if (tempMap.containsKey(secElement) && tempMap.get(secElement) != i) {
                LOGGER.debug("[" + i + "," + tempMap.get(secElement) + "]");
                result = new int[]{i, tempMap.get(secElement)};
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int[] result = twoSum(nums, 6);

    }


}
