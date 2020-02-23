package com.tian.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * 输入: [1,1,2]
 * 输出:
 * [
 * [1,1,2],
 * [1,2,1],
 * [2,1,1]
 * ]
 */
public class Solution_47 {

    List<List<Integer>> result = new ArrayList<>();

    public static void main(String[] args) {
        Solution_47 solution_47 = new Solution_47();
        List<List<Integer>> list = solution_47.permuteUnique(new int[]{1, 1, 2});
        System.out.println(list);
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] mirror = new boolean[nums.length];
        Arrays.sort(nums);
        pailie(mirror, nums, new Stack<Integer>());
        return result;
    }

    private void pailie(boolean[] mirror, int[] nums, Stack<Integer> stack) {
        if (stack.size() == nums.length) {
            List<Integer> list = new ArrayList<>(stack);
            result.add(list);
        } else {
            for (int i=0; i < nums.length; i++) {
                if (mirror[i]) {
                    continue;
                }
                stack.push(nums[i]);
                mirror[i] = true;
                pailie(mirror, nums, stack);
                mirror[i] = false;
                stack.pop();
                while (i < nums.length-1 && nums[i] == nums[i+1]) i++;
            }

        }
    }

}
