package com.tian.leetcode;

import com.sun.org.apache.xpath.internal.VariableStack;
import com.sun.org.apache.xpath.internal.WhitespaceStrippingElementMatcher;

/**
 * @author tianchengbei
 * @since 2019-11-23
 */
public class Solution_21 {

    public static void main(String[] args) {

    }

    //  4,       -1 1 1 2 3 4
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode first = l1,two = l2,jia = new ListNode(-1),prev = jia;
        while (first != null && two != null) {
            if(first.val < two.val){
                prev.next = first;
                first=first.next;    //1 2 4   3 4     -1 1
            }else {
                prev.next = two;
                two = two.next;
            }
            prev = prev.next;
        }
        prev.next = first == null ? two : first;
        return jia.next;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
