package com.tian.leetcode;

/**
 * @author tianchengbei
 * @since 2019-11-25
 */
public class Solution_27 {

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        Solution_27 so = new Solution_27();
        int i = so.removeElement(nums, 2);
        System.out.println(i);
    }

    //nums = [0,1,2,2,3,0,4,2],  val = 2,

    /**

     * @param nums
     * @param val
     * @return
     */
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            while (i < nums.length && nums[i] == val) {
                i++;
                count++;
            }
            if(i >= nums.length) return nums.length - count;
            nums[index] = nums[i];
            index++;
        }
        return nums.length - count;
    }

}
