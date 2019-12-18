package com.tian.leetcode;

/**
 * @author tianchengbei
 * @since 2019-12-18
 */
public class Solution_53 {

    /**
     * 给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
     * 输入: [-2,1,-3,4,-1,2,1,-5,4],
     * 输出: 6
     * 解释: 连续子数组 [4,-1,2,1] 的和最大，为 6。
     *
     * @param nums
     * @return
     */
    public int maxSubArray_1(int[] nums) {
        if(nums.length < 1) return 0;
        if(nums.length == 1) return nums[0];
        int max = nums[0], length = nums.length;
        for (int i = 1; i < length; i++) {
            if(nums[i-1] > 0) nums[i] = nums[i] + nums[i - 1];
            max = Math.max(max,nums[i]);
        }
        return max;
    }


}
