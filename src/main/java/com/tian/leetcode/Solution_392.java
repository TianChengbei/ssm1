package com.tian.leetcode;

public class Solution_392 {


    //abc addbec
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length()) {

            while (j < t.length() && !(s.charAt(i) == t.charAt(j))) {
                j++;
            }
            if(j >= t.length()) return false;
            i++;
            j++;
        }
        return i == s.length();
    }

}
