package com.evan.leetcode.easy;

public class Sqrt_69 {

    /**
     * Given a non-negative integer x, compute and return the square root of x.
     *
     * Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
     *
     *
     *
     * Example 1:
     *
     * Input: x = 4
     * Output: 2
     * Example 2:
     *
     * Input: x = 8
     * Output: 2
     * Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
     *
     *
     * Constraints:
     *
     * 0 <= x <= 231 - 1
     */

    public static int mySqrt(int x) {


        if (x < 0) {
            throw new RuntimeException("only allow a non-negative integer");
        }

        if (x == 0 || x == 1) {
            return x;
        }

        int start = 0;
        int end = x;
        int mid = -1;
        while (start < end) {
            mid = (start + end) / 2;
            if (mid * mid == x) {
                return mid;
            } else if (mid * mid > x) {
                end = mid - 1 ;
            } else if (mid * mid < x) {
                start = mid + 1;
            }
        }
        return mid;


    }


    public static void main(String[] args) {
        int case1 = 3;// 2
        int case2 = 8;//2
        System.out.println(mySqrt(case1));
        System.out.println(mySqrt(case2));
    }


}
