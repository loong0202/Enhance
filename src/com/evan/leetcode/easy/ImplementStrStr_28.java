package com.evan.leetcode.easy;

import sun.jvm.hotspot.utilities.Assert;

/**
 * Implement strStr().
 *
 * Return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.
 *
 * Clarification:
 *
 * What should we return when needle is an empty string? This is a great question to ask during an interview.
 *
 * For the purpose of this problem, we will return 0 when needle is an empty string. This is consistent to C's strstr() and Java's indexOf().
 *
 *
 *
 * Example 1:
 *
 * Input: haystack = "hello", needle = "ll"
 * Output: 2
 * Example 2:
 *
 * Input: haystack = "aaaaa", needle = "bba"
 * Output: -1
 *
 * Example 3:
 *
 * Input: haystack = "", needle = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= haystack.length, needle.length <= 5 * 104
 * haystack and needle consist of only lower-case English characters.
 */
public class ImplementStrStr_28 {

    public static void main(String[] args) {
        String haystackCase1 = "hello";
        String needleCase1 = "ll";
        int result1 = strStrOptimize2(haystackCase1, needleCase1);

        Assert.that(result1 == 2, "should be true");


        String haystackCase2 = "aaaaa";
        String needleCase2 = "bba";
        int result2 = strStrOptimize2(haystackCase2, needleCase2);
        Assert.that(result2 == -1, "should be true");


        String haystackCase3 = "";
        String needleCase3 = "";
        int result3 = strStrOptimize2(haystackCase3, needleCase3);
        Assert.that(result3 == 0, "should be true");

    }

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
     * Memory Usage: 39.3 MB, less than 11.88% of Java online submissions for Implement strStr()
     * @param haystack
     * @param needle
     * @return
     */
    static int strStr(String haystack,String needle){
        if(needle == null || needle.length() == 0){
            return 0;
        }

        if(haystack == null || haystack.length() == 0){
            return -1;
        }

        int needleLength = needle.length();
        int compareLength = haystack.length() - needleLength;
        for(int i=0;i<=compareLength;i++){
            String compareStr = haystack.substring(i,i+needleLength);
            if(needle.equals(compareStr)){
                return i;
            }
        }
        return -1;
    }


    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Implement strStr().
     * Memory Usage: 39.2 MB, less than 11.88% of Java online submissions for Implement strStr().
     * @param haystack
     * @param needle
     * @return
     */
    static int strStrOptimize2(String haystack,String needle){
        if(needle == null || needle.length() == 0){
            return 0;
        }

        if(haystack == null || haystack.length() == 0){
            return -1;
        }

        int needleLength = needle.length();
        int compareLength = haystack.length() - needleLength;
        for(int i=0;i<=compareLength;i++){
            //NOTES: add this condition doesn't reduce memory
            if(haystack.charAt(i) == needle.charAt(0)){
                String compareStr = haystack.substring(i,i+needleLength);
                if(needle.equals(compareStr)){
                    return i;
                }
            }
        }
        return -1;
    }


}
