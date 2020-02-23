package com.tian.leetcode;

public class Solution_35 {

    public static void main(String[] args) {
        Solution_35 solution_35 = new Solution_35();
        int i = solution_35.searchInsert(new int[]{1, 3, 5, 6}, 4);
        System.out.println(i);
    }

    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            } else if (target < nums[i]) {
                return i;
            } else if (i + 1 < nums.length && target < nums[i + 1]) {
                return i + 1;
            } else if (i == nums.length - 1) {
                return nums.length;
            }
        }
        return 0;
    }

    public int searchInsert_2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] > target) return i;
            if(nums[i] == target) return i;
        }
        return nums.length;
    }

}
