package com.tian.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author tianchengbei
 * @since 2019-11-23
 */
public class Solution_LCP1 {

    public static void main(String[] args) {
        Solution_LCP1 lcp1 = new Solution_LCP1();
        int[] guess = {2, 2, 3};
        int[] answer = {3, 2, 1};
        int game = lcp1.game(guess, answer);
        System.out.println(game);
    }

    public int game(int[] guess, int[] answer) {
        int result = 0;
        for(int i =0;i<guess.length;i++)
            if(guess[i] == answer[i]) result++;

        return result;
    }


}
