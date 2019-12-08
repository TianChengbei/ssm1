package com.tian.leetcode;

/**
 * @author tianchengbei
 * @since 2019-11-25
 */
public class Solution_26 {

    public static void main(String[] args) {
        Solution_26 so = new Solution_26();
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int i = so.removeDuplicates(nums);
        System.out.println(i);
        System.out.println(nums);
    }


    //nums = [0,0,1,1,1,2,2,3,3,4]
    public int removeDuplicates(int[] nums) {
        int realLength = 1;
        for (int i = 1; i < nums.length; i++) {
            while (i < nums.length && nums[i] == nums[i - 1]) i++;
            if(i >= nums.length) return realLength;
            realLength++;
            nums[realLength-1] = nums[i];
        }
        return realLength;
    }


}
