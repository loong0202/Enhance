package com.evan.leetcode.easy;

public class MaximumSubarray_53 {

    /**
     * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
     *
     * Follow up: If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
     *
     *
     *
     * Example 1:
     *
     * Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
     * Output: 6
     * Explanation: [4,-1,2,1] has the largest sum = 6.
     * Example 2:
     *
     * Input: nums = [1]
     * Output: 1
     * Example 3:
     *
     * Input: nums = [0]
     * Output: 0
     * Example 4:
     *
     * Input: nums = [-1]
     * Output: -1
     * Example 5:
     *
     * Input: nums = [-2147483647]
     * Output: -2147483647
     * @param nums
     * @return
     */
    public static int maxSubArray(int[] nums) {

        int result = Integer.MIN_VALUE;
        int subSum = 0;
        for(int num:nums){
            subSum = Math.max(subSum+num,num);
            result = Math.max(subSum,result);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] numsCase1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4}; //Output: 6 [4,-1,2,1] has the largest sum = 6.

        int[] numsCase2 = {1};// 1

        int[] numsCase3 = {0};// 0

        int[] numsCase4 = {-1};// -1

        int[] numsCase5 = {-2147483647};//-2147483647


        System.out.println(maxSubArray(numsCase1));
        System.out.println(maxSubArray(numsCase2));
        System.out.println(maxSubArray(numsCase3));
        System.out.println(maxSubArray(numsCase4));
        System.out.println(maxSubArray(numsCase5));
    }
}
