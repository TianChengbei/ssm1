package com.tian.leetcode;

import com.tian.test.So;
import sun.misc.resources.Messages_zh_CN;

/**
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 *
 * 示例 1:
 *
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 *
 * 输入: [7,8,9,11,12]
 * 输出: 1
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/first-missing-positive
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_41 {

    public static void main(String[] args) {
        Solution_41 solution_41 = new Solution_41();
        int i = solution_41.firstMissingPositive(new int[]{7,8,9,11,12});
        System.out.println(i);
    }

    public int firstMissingPositive(int[] nums) {
        int max = 0,min = 0;
        int newNums[] = new int[nums.length+1];
        for(int num : nums){
            if(num > max) max = num;
            if(num < min) min = num;
            if(num > 0 && num <= nums.length) newNums[num] = num;
        }
        if(max <= 0) return 1;
        for(int i =1 ;i<newNums.length;i++){
            if(newNums[i] == 0) return i;
        }
        return max+1;
    }

}
