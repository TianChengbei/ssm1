package com.tian.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-11-24
 */
public class Solution_23 {

    public ListNode mergeKLists(ListNode[] lists) {

        List<Integer> list = new ArrayList<>();
        for (ListNode listNode : lists) {
            while (listNode != null) {
                list.add(listNode.val);
                listNode = listNode.next;
            }
        }
        Collections.sort(list);
        ListNode head = null, next = null;
        for (int i = 0; i < list.size(); i++) {
            if (i == 0) {
                head = new ListNode(list.get(i));
                next = head;
                continue;
            } else {
                next.next = new ListNode(list.get(i));
                next = next.next;
            }
        }
        return head;
    }


    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
