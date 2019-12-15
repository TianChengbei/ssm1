package com.tian.sort;

/**
 * @author tianchengbei
 * @since 2019-12-15
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] nums = {11, 22, 7, 2, 90};
        quicksort(nums,0,nums.length-1);
        System.out.println(nums);
    }

    public static void quicksort(int[] nums, int start, int end) {
        if(start >= end) return;
        int flag = nums[start];
        int a = start;
        int b = end;
        while (start < end) {

            while (nums[end] > flag && start < end) end--;
            while (nums[start] <= flag && start < end) start++;
            //交换
            exchange(nums,start,end);
        }
        exchange(nums,a,start);
        quicksort(nums,a,start-1);
        quicksort(nums,start+1,b);
    }

    private static void exchange(int[] nums, int start, int end) {
        int a = nums[start];
        nums[start] = nums[end];
        nums[end] = a;
    }


}
