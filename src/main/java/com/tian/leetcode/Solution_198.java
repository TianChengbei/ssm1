package com.tian.leetcode;

import java.util.zip.CRC32;

public class Solution_198 {

    public static void main(String[] args) {

    }

    public int rob_1(int[] nums) {
        if(nums.length == 0) return 0;
        int[] dp = new int[nums.length + 1];
        dp[0] = 0;
        dp[1] = nums[0];
        for (int i = 2; i <= nums.length; i++) {
            dp[i] = Math.max(dp[i-1],dp[i-2]+nums[i-1]);
        }
        return dp[nums.length];
    }


}