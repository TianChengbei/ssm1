package com.tian.leetcode;

import java.util.List;
import java.util.Stack;

/**
 * @author tianchengbei
 * @since 2019-12-29
 */
public class Solution_61 {

    public static void main(String[] args) {
//        0->1->2->NULL, k = 4
//        输出: 2->0->1->NU]
        Solution_61 solution_61 = new Solution_61();
        ListNode node1 = solution_61.new ListNode(0);
        ListNode node2 = solution_61.new ListNode(1);
        ListNode node3 = solution_61.new ListNode(2);
//        node1.next = node2;
//        node2.next = node3;
        ListNode re = solution_61.rotateRight(node1 , 1);
        while(re != null){
            System.out.print(re.val+"->");
            re = re.next;
        }
    }

    // 0->1->2
    public ListNode rotateRight(ListNode head, int k) {
        if (k <= 0) return head;
        if(head == null) return head;
        ListNode hd = head;
        ListNode tail = null;
        int length = 0;
        Stack<ListNode> stack = new Stack<>();
        while (hd != null) {
            length++;
            stack.push(hd);
            if (hd.next == null) tail = hd;
            hd = hd.next;
        }
        //合成循环链表
        tail.next = head;
        int num = k % length == 0 ? length : k % length;
        ListNode result = null;
        while (num > 0) {
            result = stack.pop();
            num--;
        }
        //断链
        hd = result;
        while(hd.next != result){
            hd = hd.next;
        }
        hd.next = null;
        return result;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
