package com.tian.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;

/**
 * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。
 * <p>
 * (注：分数越高的选手，排名越靠前。)
 * <p>
 * 示例 1:
 * <p>
 * 输入: [5, 4, 3, 2, 1]
 * 输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * 解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and "Bronze Medal").
 * 余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/relative-ranks
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_506 {

    public String[] findRelativeRanks(int[] nums) {
        String[] res = new String[nums.length];
        int[] x = Arrays.copyOf(nums, nums.length);
        Arrays.sort(x);
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < x.length; i++) {
            if (i == 0) map.put(x[x.length - 1], "Gold Medal");
            else if (i == 1) map.put(x[x.length-2],"Silver Medal");
            else if(i == 2) map.put(x[x.length-3],"Bronze Medal");
            else map.put(x[x.length-i-1],i+1+"");
        }
        for(int i =0;i<nums.length;i++){
            res[i] = map.get(nums[i]);
        }
        return res;
    }

}
