package com.tian.leetcode;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-11-23
 */
public class Solution_18 {

    public static void main(String[] args) {
        Solution_18 so = new Solution_18();
        int[] nums = {0,0,0,0};
        int target = 0;
        List<List<Integer>> lists = so.fourSum(nums, target);
//        lists.stream().forEach(list -> System.out.println(list.toString()));
    }

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int a = 0; a < nums.length - 3; a++) {
            if (a > 0 && nums[a] == nums[a - 1]) continue;
            for (int b = a + 1; b < nums.length - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b - 1]) continue;
                int c = b + 1, d = nums.length - 1;
                while (c < d) {
                    int sum = nums[a] + nums[b] + nums[c] + nums[d];
                    if (sum < target) c++;
                    else if (sum > target) d--;
                    else {
                        List list = new ArrayList<Integer>();
                        list.addAll(Arrays.asList(nums[a], nums[b], nums[c], nums[d]));
                        result.add(list);
                        while (c < d && nums[c + 1] == nums[c]) c++;
                        while (c < d && nums[d - 1] == nums[d]) d--;
                        c++;
                        d--;
                    }
                }
            }
        }
        return result;
    }

}
