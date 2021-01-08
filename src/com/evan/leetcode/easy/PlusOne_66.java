package com.evan.leetcode.easy;

public class PlusOne_66 {

    /**
     * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
     * <p>
     * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
     * <p>
     * You may assume the integer does not contain any leading zero, except the number 0 itself.
     * <p>
     * <p>
     * <p>
     * Example 1:
     * <p>
     * Input: digits = [1,2,3]
     * Output: [1,2,4]
     * Explanation: The array represents the integer 123.
     * Example 2:
     * <p>
     * Input: digits = [4,3,2,1]
     * Output: [4,3,2,2]
     * Explanation: The array represents the integer 4321.
     * Example 3:
     * <p>
     * Input: digits = [0]
     * Output: [1]
     * <p>
     * <p>
     * Constraints:
     * <p>
     * 1 <= digits.length <= 100
     * 0 <= digits[i] <= 9
     *
     * @param digits
     * @return
     */
    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;

        return digits;
    }


    public static void main(String[] args) {
        int[] digitsCase1 = {1, 2, 3};// [1,2,4]
        int[] digitsCase2 = {4, 3, 2, 1};// [4,3,2,2]
        int[] digitsCase3 = {0};//[1]


        System.out.println(plusOne(digitsCase1));
        System.out.println(plusOne(digitsCase2));
        System.out.println(plusOne(digitsCase3));
    }
}
