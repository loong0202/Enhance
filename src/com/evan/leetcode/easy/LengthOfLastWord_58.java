package com.evan.leetcode.easy;

public class LengthOfLastWord_58 {

    /**
     * Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
     *
     * A word is a maximal substring consisting of non-space characters only.
     *
     *
     *
     * Example 1:
     *
     * Input: s = "Hello World"
     * Output: 5
     * Example 2:
     *
     * Input: s = " "
     * Output: 0
     *
     *
     * Constraints:
     *
     * 1 <= s.length <= 104
     * s consists of only English letters and spaces ' '.
     * @param s
     * @return
     */
    public static int lengthOfLastWord(String s) {

        String[] sArray = s.split(" ");
        if(sArray == null || sArray.length == 0){
            return 0;
        }
        return sArray[sArray.length-1].length();
    }




    public static int lengthOfLastWord2(String s) {

        s = s.trim();
        if(s == null || s.length() == 0){
            return 0;
        }
        int count = 0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) == ' '){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String sCase1 = "Hello World";//5
        String sCase2 = " ";//0


        System.out.println(lengthOfLastWord2(sCase1));
        System.out.println(lengthOfLastWord2(sCase2));
    }
}
