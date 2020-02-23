package com.tian.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 给定一个数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * <p>
 * candidates 中的每个数字在每个组合中只能使用一次。
 * <p>
 * 说明：
 * <p>
 * 所有数字（包括目标数）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 * <p>
 * 输入: candidates = [10,1,2,7,6,1,5], target = 8,
 * 所求解集为:
 * [
 * [1, 7],
 * [1, 2, 5],
 * [2, 6],
 * [1, 1, 6]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combination-sum-ii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_40 {

    public static void main(String[] args) {
        Solution_40 solution_40 = new Solution_40();
        List<List<Integer>> list = solution_40.combinationSum2(new int[]{10,1,2,7,6,1,5}, 8);
        System.out.println(list);
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        digui(res,new ArrayList<>(), candidates,0, target,0);
        return res;
    }

    private void digui(List<List<Integer>> res, List<Integer> list, int[] candidates, int sum, int target, int index) {
        if (sum > target) return;
        if (sum == target) {
            if(!res.contains(list)) res.add(list);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            List<Integer> list_1 = new ArrayList<>(list);
            list_1.add(candidates[i]);
            digui(res,list_1,candidates,sum+candidates[i],target,i+1);
        }

    }

}
