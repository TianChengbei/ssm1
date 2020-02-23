package com.tian.leetcode;

import javax.sound.midi.Soundbank;

/**
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 */
public class Solution_38 {

    public static void main(String[] args) {
        Solution_38 solution_38 = new Solution_38();
        String s = solution_38.countAndSay(6);
        System.out.println(s);
    }

    public String countAndSay(int n) {
        String res,str;
        res = "1";
        for (int i = 1; i < n; i++) {
            str = res;
            res = "";
            for(int j =0;j<str.length();){
                int c = 0;
                int k = j;
                while(k < str.length() && str.charAt(k) == str.charAt(j)){
                    c++;
                    k++;
                }
                res += c;
                res += str.charAt(j);
                j = k;
            }
        }
        return res;
    }


}
