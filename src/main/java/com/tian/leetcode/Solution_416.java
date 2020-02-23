package com.tian.leetcode;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Stack;

/**
 * 给定一个只包含正整数的非空数组。是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
 * <p>
 * 注意:
 * <p>
 * 每个数组中的元素不会超过 100
 * 数组的大小不会超过 200
 * 示例 1:
 * <p>
 * 输入: [1, 5, 11, 5]
 * <p>
 * 输出: true
 * <p>
 * 解释: 数组可以分割成 [1, 5, 5] 和 [11].
 */
public class Solution_416 {

    public static void main(String[] args) {
        Solution_416 solution_416 = new Solution_416();
        solution_416.canPartition_2(new int[]{1, 5, 11, 5});
    }

    public boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        //和是奇数返回错误
        if (!(sum % 2 == 0)) return false;
        int len = nums.length;
        int target = sum / 2;
        boolean[][] res = new boolean[len+1][target + 1];
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= target; j++) {
                if (j < nums[i-1]) {
                    res[i][j] = res[i - 1][j];
                    continue;
                }
                if (j == nums[i-1]) {
                    res[i][j] = true;
                    continue;
                }
                if (j > nums[i-1]) {
                    res[i][j] = res[i - 1][j] || res[i - 1][j - nums[i-1]];
                    continue;
                }
            }
        }
        return res[len][target];
    }


    public boolean canPartition_2(int[] nums) {
        int sum = 0;
        for (int num : nums) sum += num;
        //和是奇数返回错误
        if (!(sum % 2 == 0)) return false;
        int len = nums.length;
        int target = sum / 2;
        int[][] res = new int[len+1][target + 1];
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= target; j++) {
                if (j < nums[i-1]) {
                    res[i][j] = res[i - 1][j];
                    continue;
                }
                if (j >= nums[i-1]) {
                    res[i][j] = Math.max(res[i - 1][j], res[i - 1][j - nums[i-1]]+nums[i-1]);
                    continue;
                }
            }
        }
        return res[len][target] == target;
    }

}
