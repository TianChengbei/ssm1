package com.tian.leetcode;

/**
 * 给定一个不含重复元素的整数数组。一个以此数组构建的最大二叉树定义如下：
 * <p>
 * 二叉树的根是数组中的最大元素。
 * 左子树是通过数组中最大值左边部分构造出的最大二叉树。
 * 右子树是通过数组中最大值右边部分构造出的最大二叉树。
 * 通过给定的数组构建最大二叉树，并且输出这个树的根节点。
 * <p>
 *  
 * <p>
 * 示例 ：
 * <p>
 * 输入：[3,2,1,6,0,5]
 * 输出：返回下面这棵树的根节点：
 * <p>
 * 6
 * /   \
 * 3     5
 * \    /
 * 2  0
 * \
 * 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution_654 {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums.length < 1) return null;
        //构建最大堆
        buildHeap(nums);
        //构建最大堆索引
        TreeNode[] nodes = new TreeNode[nums.length];
        for(int i = 0;i<nums.length;i++){
            nodes[i] = new TreeNode(nums[i]);
        }
        for(int i =0 ;i<nums.length;i++){
            if(i*2+1 < nums.length) nodes[i].left = nodes[i*2+1];
            if(i*2+2 < nums.length) nodes[i].right = nodes[i*2+2];
        }
        return nodes[0];
    }

    private void buildHeap(int[] nums) {
        //从第一个非叶子节点开始下沉
        for (int i = (nums.length - 2) / 2; i >= 0; i--) {
            downAdjust(nums, i, nums.length);
        }
    }

    private void downAdjust(int[] nums, int parentIndex, int length) {
        int tem = nums[parentIndex];
        int childIndex = parentIndex * 2 + 1;
        while (childIndex < length) {
            if (childIndex + 1 < length && nums[childIndex + 1] > nums[childIndex]) {
                childIndex++;
            }
            if (tem >= nums[childIndex]) break;
            swap(nums, parentIndex, childIndex);
            parentIndex = childIndex;
            childIndex = parentIndex * 2 + 1;
        }
    }

    private void swap(int[] nums, int parentIndex, int childIndex) {
        int a = nums[parentIndex];
        nums[parentIndex] = nums[childIndex];
        nums[childIndex] = a;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
