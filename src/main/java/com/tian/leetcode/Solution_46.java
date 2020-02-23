package com.tian.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个没有重复数字的序列，返回其所有可能的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/permutations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_46 {
    List<List<Integer>> resul = new ArrayList<>();

    public static void main(String[] args) {
        Solution_46 solution_46 = new Solution_46();
        solution_46.permute(new int[]{1, 2, 3});
        System.out.println(solution_46.resul.toString());
    }

    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) return resul;
        allSort(nums,new Stack<Integer>());
        return resul;
    }

    private void allSort(int[] nums, Stack<Integer> stack) {
        if(stack.size() == nums.length){
            resul.add(new ArrayList<Integer>(stack));
            return;
        }else{
            for(int num : nums){
                if(stack.contains(num)) continue;
                stack.push(num);
                allSort(nums,stack);
                stack.pop();
            }
        }
    }
}
