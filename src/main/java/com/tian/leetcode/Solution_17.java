package com.tian.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-11-11
 */
public class Solution_17 {

    private String numberMap[] = {
            "",  //0
            "",  //1
            "abc", //2
            "def", //3
            "ghi", //4
            "jkl", //5
            "mno", //6
            "pqrs", //7
            "tuv", //8
            "wxyz" //9
    };
    private List<String> result;

    public static void main(String[] args) {
        String s = "23";
        Solution_17 solution_17 = new Solution_17();
        List<String> list = solution_17.result_1(s);
        System.out.println(list.toString());
    }


    public List<String> result_1(String input) {
        result = new ArrayList<>();
        if (input.equals("")) return result;
        digui(input, 0, "");
        return result;
    }

    private void digui(String input, int index, String branch) {
        if (index == input.length()) {
            result.add(branch);
            return;
        }
        char c = input.charAt(index);
        String s = numberMap[c - '0'];
        for (int i = 0; i < s.length(); i++) {
            digui(input,index+1,branch+s.charAt(i));
        }
    }


}
