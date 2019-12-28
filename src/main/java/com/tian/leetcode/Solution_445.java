package com.tian.leetcode;

import java.util.List;
import java.util.Stack;

/**
 * @author tianchengbei
 * @since 2019-12-23
 *
 * 给定两个非空链表来代表两个非负整数。数字最高位位于链表开始位置。它们的每个节点只存储单个数字。将这两数相加会返回一个新的链表。
 *
 *  
 *
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * 进阶:
 *
 * 如果输入链表不能修改该如何处理？换句话说，你不能对列表中的节点进行翻转。
 *
 * 示例:
 *
 * 输入: (7 -> 2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出: 7 -> 8 -> 0 -> 7
 *
 */
public class Solution_445 {

    public static void main(String[] args) {
        Solution_445 solution_445 = new Solution_445();
        ListNode l1 = solution_445.new ListNode(9);
        ListNode l2 = solution_445.new ListNode(1);
        ListNode l3 = solution_445.new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        ListNode r1 = solution_445.new ListNode(0);
        solution_445.addTwoNumbers_1(l1,r1);
    }


    public ListNode addTwoNumbers_1(ListNode l1, ListNode l2) {
        ListNode ll1 = l1,ll2 = l2;
        Stack<ListNode> s1 = new Stack<>();
        Stack<ListNode> s2 = new Stack<>();
        Stack<Integer> result = new Stack<>();
        while (ll1 != null){
            s1.push(ll1);
            ll1=ll1.next;
        }
        while (ll2 != null){
            s2.push(ll2);
            ll2=ll2.next;
        }
        int jin =0;
        while (s1.size() != 0 && s2.size() != 0){
            int he = s1.pop().val + s2.pop().val + jin;
            jin = he / 10;
            int zhi = he % 10;
            result.push(zhi);
        }
        while (s1.size() > 0){
            int he = s1.pop().val + jin;
            jin = he / 10;
            int zhi = he % 10;
            result.push(zhi);
        }
        while (s2.size() > 0){
            int he = s2.pop().val + jin;
            jin = he / 10;
            int zhi = he % 10;
            result.push(zhi);
        }
        if(jin>0) result.push(jin);
        ListNode head = new ListNode(-1);
        ListNode hd = head;
        while(result.size() > 0){
            hd.next = new ListNode(result.pop());
            hd = hd.next;
        }
        return head.next;
    }

     class ListNode {
        int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

}
