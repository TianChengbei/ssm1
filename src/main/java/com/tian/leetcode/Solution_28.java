package com.tian.leetcode;

/**
 * @author tianchengbei
 * @since 2019-11-25
 */
public class Solution_28 {

    public static void main(String[] args) {
        Solution_28 so = new Solution_28();
        String h = "hello";
        String n =  "ll";
        so.strStr(h,n);
    }

    //"mississippi"
    //"issip"
    public int strStr(String haystack, String needle) {
        if(needle.length() == 0) return 0;
        int index = -1;
        for (int i = 0; i < haystack.length(); i++) {
            int circle = 0,ic = i;
            while(ic<haystack.length() && circle < needle.length() && haystack.charAt(ic) == needle.charAt(circle)){
                ic++;
                circle++;
            }
            if(circle == needle.length()) return ic - circle;
        }
        return index;
    }


}
