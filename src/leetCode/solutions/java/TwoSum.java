package leetCode.solutions.java;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    private static int[] twoSum(int[] nums, int target) {
        System.out.println("\nInput: nums = " + Arrays.toString(nums) + ", target = " + target);

        Map<Integer, Integer> twoSumIndexMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            System.out.println("\nIndex: " + i);

            int complement = target - nums[i];
            System.out.println("-> Next num: " + nums[i] + ", Complement: " + complement);

            // If the complement exists then return the indices of the current element and the complement.
            if (twoSumIndexMap.containsKey(complement)) {
                System.out.println("---> Complement (" + complement + ") exist in Map with Index: " + twoSumIndexMap.get(complement));
                return new int[] { twoSumIndexMap.get(complement), i };
            } else {
                // Otherwise, put the element in the Map, and move to the next iteration.
                twoSumIndexMap.put(nums[i], i); // { num, index }
            }
            System.out.println("----> twoSumIndexMap: " + twoSumIndexMap);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        //Example 1:
        //Input: nums = [2,7,11,15], target = 9
        //Output: [0,1]
        //Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
        System.out.println("Output: " + Arrays.toString(twoSum(new int[]{ 2, 7, 11, 15 }, 9)));

        //Example 2:
        //Input: nums = [3,2,4], target = 6
        //Output: [1,2]
        //System.out.println("Output: " + Arrays.toString(twoSum(new int[]{ 3, 2, 4 }, 6)));

        //Example 3:
        //Input: nums = [3,3], target = 6
        //Output: [0,1]
        //xxSystem.out.println("Output: " + Arrays.toString(twoSum(new int[]{ 3, 3 }, 9)));
    }
}
