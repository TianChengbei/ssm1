package com.tian.leetcode;

import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-11-23
 */
public class Solution_19 {

    public static void main(String[] args) {
        Solution_19 so = new Solution_19();
        ListNode head = new ListNode(2);
        so.removeNthFromEnd(head, 2);
    }

    //两边循环
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        int length = 1;
        while (first.next != null) {
            first = first.next;
            length++;
        }
        int qu = length - n;
        first = head;
        //第一个元素
        if (qu == 0) return head.next;
        while (qu > 1) {
            first = first.next;
            qu--;
        }
        first.next = first.next.next;
        return head;
    }

    public ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode jia = new ListNode(0);
        jia.next = head;
        ListNode p = jia, q = jia;
        int a = 1;
        while(p.next != null){
            p = p.next;
            if(a > n) q = q.next;
            a++;
        }

        q.next = q.next.next;

        return jia.next;
    }


    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
