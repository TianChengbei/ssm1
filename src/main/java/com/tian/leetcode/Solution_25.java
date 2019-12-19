package com.tian.leetcode;

import java.util.List;
import java.util.Stack;
import javax.sound.midi.Soundbank;

/**
 * @author tianchengbei
 * @since 2019-12-18
 * <p>
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。
 * <p>
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * <p>
 * 示例 :
 * <p>
 * 给定这个链表：1->2->3->4->5
 * <p>
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * <p>
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 * <p>
 * 说明 :
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 */
public class Solution_25 {

    public static void main(String[] args) {
        //1 2 3 4 5
        ListNode head = init();
        result(head);
        System.out.println();
        System.out.println("------------");
        ListNode result = reverseKGroup(head, 3);
        result(result);
    }

    private static void result(ListNode result) {
        ListNode rr = result;
        while(rr != null){
            System.out.print(rr.val+" ");
            rr= rr.next;
        }
    }
// 2-1-4-3-
    public static ListNode reverseKGroup(ListNode head, int k) {
        if(k <= 1) return head;
        ListNode hd = head, resultHead = null,rh=resultHead;
        Stack<ListNode> stack = new Stack<>();
        int mod = 0;
        while (hd != null) {

            stack.push(hd);
            mod++;
            hd = hd.next;

            //每k个元素进行反转
            if (mod == k) {
                while (stack.size() > 0) {
                    if (resultHead == null) {
                        resultHead = stack.pop();
                        rh = resultHead;
                    }else{
                        rh.next = stack.pop();
                        rh = rh.next;
                    }
                }
                //标识当前进入新的一组k
                mod = 0;
            }

        }
        //将剩下不够k个元素的值重新改成原来的顺序
        Stack<ListNode> reflect = new Stack<>();
        while(stack.size() != 0){
            reflect.push(stack.pop());
        }
        while(reflect.size() != 0){
            if(resultHead == null){
                resultHead = reflect.pop();
                rh = resultHead;
            }else{
                rh.next = reflect.pop();
                rh = rh.next;
            }
        }
        if(rh != null) rh.next = null;
        return resultHead;
    }

    static ListNode init(){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        return node1;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
