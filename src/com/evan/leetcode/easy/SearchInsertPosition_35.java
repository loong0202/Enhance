package com.evan.leetcode.easy;

import sun.jvm.hotspot.utilities.Assert;

/**
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * <p>
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * <p>
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 * <p>
 * Example 4:
 * Input: nums = [1,3,5,6], target = 0
 * Output: 0
 * <p>
 * Example 5:
 * Input: nums = [1], target = 0
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 104
 * -104 <= nums[i] <= 104
 * nums contains distinct values sorted in ascending order.
 * -104 <= target <= 104
 */
public class SearchInsertPosition_35 {


    public static void main(String[] args) {
        int[] numCase1 = {1, 3, 5};
        int targetCase1 = 4;
        int result1 = searchInsertOptimize2(numCase1, targetCase1);
        Assert.that(result1 == 2, "result should be 2");

        int[] numCase2 = {1, 3, 5, 6};
        int targetCase2 = 2;
        int result2 = searchInsertOptimize2(numCase2, targetCase2);
        Assert.that(result2 == 1, "result should be 1");


        int[] numCase3 = {1, 3, 5, 6};
        int targetCase3 = 7;
        int result3 = searchInsertOptimize2(numCase3, targetCase3);
        Assert.that(result3 == 4, "result should be 4");


        int[] numCase4 = {1, 3, 5, 6};
        int targetCase4 = 0;
        int result4 = searchInsertOptimize2(numCase4, targetCase4);
        Assert.that(result4 == 0, "result should be 0");


        int[] numCase5 = {1};
        int targetCase5 = 0;
        int result5 = searchInsertOptimize2(numCase5, targetCase5);
        Assert.that(result5 == 0, "result should be 0");

    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Search Insert Position.
     * Memory Usage: 38.9 MB, less than 23.53% of Java online submissions for Search Insert Position.
     *
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {

        int startPoint = 0;
        int endPoint = nums.length - 1;

        int result = 0;
        while (startPoint <= endPoint) {
            int currentPoint = (startPoint + endPoint) / 2;

            if (nums[currentPoint] == target) {
                result = currentPoint;
                break;
            }

            if (nums[currentPoint] > target) {
                endPoint = currentPoint - 1;
                if (startPoint > endPoint) {
                    if (nums[0] > target) {
                        return 0;
                    } else {
                        result = startPoint;
                    }

                }
            }

            if (nums[currentPoint] < target) {
                startPoint = currentPoint + 1;
                if (startPoint > endPoint) {
                    if (nums[endPoint] < target) {
                        return endPoint + 1;
                    } else {
                        result = endPoint;
                    }
                }

            }

        }
        return result;

    }




    /// NOTES：It doesn't works
    public static int searchInsertOptimize2(int[] nums, int target) {

        int startPoint = 0;
        int endPoint = nums.length - 1;

        int result = 0;
        while (startPoint <= endPoint) {
            int currentPoint = (startPoint + endPoint) / 2;

            if (nums[currentPoint] == target) {
                result = currentPoint;
                break;
            }

            if (nums[currentPoint] > target) {
                endPoint = currentPoint - 1;
                if (endPoint > 0) {
                    result = endPoint;
                }
            }

            if (nums[currentPoint] < target) {
                startPoint = currentPoint + 1;
                result = startPoint;
            }

        }
        return result;

    }
}
