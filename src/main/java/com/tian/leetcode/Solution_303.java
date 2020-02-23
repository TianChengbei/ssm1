package com.tian.leetcode;

public class Solution_303 {

    int[] nums;
    // 0 1 2 3 4
    public int sumRange(int i, int j) {
        if (nums.length == 0 || i > j || i < 0 || j >= nums.length) return 0;
        int[] res = new int[j - i + 2];
        res[0] = 0;
        int tem = i,num =1;
        while (i <= j) {
            res[num] = res[num-1] + nums[i];
            i++;
            num++;
        }
        return res[num - 1];
    }

}
