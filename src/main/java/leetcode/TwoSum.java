package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        int[] sums = {2, 7, 11, 15};
//        int target = 9;
        int[] sums = {3, 2, 4};
        int target = 6;
//        int[] sums = {3,3};
//        int target = 6;
//        int[] sums = {-1, -2, -3, -4, -5};
//        int target = -8;
        System.out.println(Arrays.toString(twoSum(sums, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] results = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {
                    results[0] = i;
                    results[1] = j;
                }
            }
        }

        Arrays.sort(results);
        return results;
    }
}
