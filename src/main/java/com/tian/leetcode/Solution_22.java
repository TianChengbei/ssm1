package com.tian.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-11-24
 */
public class Solution_22 {

    public static void main(String[] args) {
        Solution_22 so = new Solution_22();
        List<String> list = so.generateParenthesis(3);
        System.out.println(list);
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
    digui(result,"",0,0,n);
        return result;
}

    private void digui(List<String> result, String branch, int open, int close, int n) {
        if (branch.length() == n * 2) {
            result.add(branch);
            return;
        }

        if (open < n) digui(result, branch + "(", open + 1, close, n);
        if (close < open) digui(result, branch + ")", open, close + 1, n);
    }


}
