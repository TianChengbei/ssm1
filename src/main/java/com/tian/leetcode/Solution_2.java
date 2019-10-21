package com.tian.leetcode;

import java.util.Stack;

public class Solution_2 {

    public static void main(String[] args) {
        Solution_2 cf = new Solution_2();
        ListNode l1 = cf.new ListNode(2);
        l1.next = cf.new ListNode(4);
        ListNode l2 = cf.new ListNode(5);
        l2.next = cf.new ListNode(6);
        ListNode listNode = cf.addTwoNumbersZ(l1, l2);
        while (listNode != null) {
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }

    /**
     * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
     * 输出：7 -> 0 -> 8
     * 原因：342 + 465 = 807
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode head = result;
        int yichu = 0;
        int he = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                he = l1.val + l2.val + yichu;
                yichu = he / 10;
                result.next = new ListNode(he % 10);
            } else if (l1 != null) {
                he = l1.val + yichu;
                yichu = he / 10;
                result.next = new ListNode(he % 10);
            } else if (l2 != null) {
                he = l2.val + yichu;
                yichu = he / 10;
                result.next = new ListNode(he % 10);
            }
            result = result.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if (yichu != 0) {
            result.next = new ListNode(yichu);
            result = result.next;
        }
        return head.next;
    }

    /**
     * 正序存储
     * (3→4→2)+(4→6→5)=8→0→7
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbersZ(ListNode l1, ListNode l2) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        ListNode p = l1, q = l2;
        while (p != null) {
            s1.push(p.val);
            p = p.next;
        }
        while (q != null) {
            s2.push(q.val);
            q = q.next;
        }
        p = l1;
        q = l2;
        int yichu = 0, he = 0;
        Stack<Integer> re = new Stack<>();
        while (!s1.empty() || !s2.empty()) {
            Integer a = s1.empty() ? 0 : s1.pop();
            Integer b = s2.empty() ? 0 : s2.pop();
            he = a + b + yichu;
            yichu = he / 10;
            re.push(he % 10);
        }
        if(yichu > 0) re.push(yichu);
        ListNode reli = new ListNode(0);
        ListNode rr = reli;
        while (!re.empty()) {
            rr.next = new ListNode(re.pop());
            rr = rr.next;
        }
        return reli.next;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
