package com.tuning;

/**
 * @author wangzy
 * @date 2022/3/8
 * 反转链表
 **/
public class L1ReverseNode {

    static class Node {
        int value;
        Node next;

        private Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", next=" + next +
                    '}';
        }
    }

    //通过迭代
    private static Node iterator(Node head) {
        Node prev = null, next;
        Node curr = head;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    //通过递归
    private static Node recursion(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = recursion(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;

    }

    public static void main(String[] args) {

        // n1->n2->n3->n4->n5
        Node n5 = new Node(5, null);
        Node n4 = new Node(4, n5);
        Node n3 = new Node(3, n4);
        Node n2 = new Node(2, n3);
        Node n1 = new Node(1, n2);

        System.out.println(n1);
        recursion(n1);
//        iterator(n1);
        System.out.println(n5);
    }
}
