package com.tian.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Solution_1 {

    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum3(nums, target);
        System.out.println(ints[0]+" "+ints[1]);
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] anw = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for(int j = i+1;j<nums.length;j++){
                if(nums[i] + nums[j] == target){
                    anw[0] = i;
                    anw[1] = j;
                    return anw;
                }
            }
        }
        return anw;
    }

    public static int[] twoSum2(int[] nums, int target) throws IllegalAccessException {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            map.put(nums[i],i);
        }

        for(int i=0;i<nums.length;i++){
            int com = target - nums[i];
            if(map.containsKey(com) && map.get(com) != i){
                return new int[] {map.get(com),i};
            }
        }
        throw new IllegalAccessException("no two sum arguement");
    }

    public static int[] twoSum3(int[] nums, int target) throws IllegalAccessException {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i< nums.length;i++){
            int com = target - nums[i];
            if(map.containsKey(com)){
                return new int[] {map.get(com),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalAccessException("no two sum arguement");
    }

}
