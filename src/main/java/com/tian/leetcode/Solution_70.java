package com.tian.leetcode;

/**
 * @author tianchengbei
 * @since 2019-12-18
 */
public class Solution_70 {

    public static void main(String[] args) {
        Solution_70 solution_70 = new Solution_70();
        int i = solution_70.climbStairs_1(3);
        System.out.println(i);
    }

    /**
     * 递归
     * @param n
     * @return
     */
    public int climbStairs(int n) {
        if(n ==1) return 1;
        if(n == 2) return 2;
        return climbStairs(n-1)+climbStairs(n-2);
    }

    public int climbStairs_1(int n) {
        if(n < 1) return 0;
        if(n ==1) return 1;
        if(n == 2) return 2;
        int[] cs = new int[n];
        cs[0] = 1;
        cs[1] = 2;
        for(int i = 2 ;i<n;i++){
            cs[i] = cs[i-1] + cs[i-2];
        }
        return cs[n-1];
    }

}
