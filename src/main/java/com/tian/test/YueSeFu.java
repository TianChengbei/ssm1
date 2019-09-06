package com.tian.test;

public class YueSeFu {

    public static void main(String[] args) {
        int soldierNums = 5;
        int roundNum = 3;      //   3

        //链表的头节点
        Node head = null;

        //时间复杂度 O(n)
        //构建一个循环链表
        for (int i=0; i<soldierNums; i++) {
            Node node = new Node(i);
            if (head == null) {
                head = node;
            } else {
                Node node1 = head;
                while(node1.next != null) {
                    node1 = node1.next;
                }
                node1.next = node;
                if (i == soldierNums-1) {
                    node.next = head;
                }
            }
        }

        //时间复杂度O(n2)
        //开始遍历删除
        Node start = head;
        Node pre = null;
        int i = 0;
        while(start != null) {
            if ((i+2)%roundNum == 0) {
                pre = start;
            }
            Node next = start.next;
            if ((i+1)%roundNum == 0) {
                //删除节点
                System.out.println(start.solider);
                pre.next = next;
                i = 0;
            } else {
                i++;
            }
            start = next;
            if (start.next == next) {
                System.out.println(start.solider);
                return;
            }
        }
    }


    /**
     * 创建的是单向链表的节点
     */
    static class Node {
        int solider;
        Node next;

        Node(int solider) {
            this.solider = solider;
            this.next = null;
        }
    }
}
