package com.tian.leetcode;

import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-11-24
 */
public class Solution_24 {

    public static void main(String[] args) {

    }

    public ListNode swapPairs(ListNode head) {
        ListNode sai = new ListNode(-1);
        sai.next = head;
        ListNode loop=sai;
        while (loop.next != null && loop.next.next != null) {
            ListNode cur = loop.next;
            ListNode near = loop.next.next;
            cur.next = cur.next.next;
            loop.next = near;
            near.next = cur;
            loop = loop.next.next;
        }
        return sai.next;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
