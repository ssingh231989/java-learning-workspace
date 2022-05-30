package com.interview.practise;

public class LinklistDemo {

    static class Node {
        int data;
        Node next;
    }

    static Node newNode(int data) {
        Node tmp = new Node();
        tmp.data = data;
        tmp.next = null;
        return tmp;
    }

    static int count(Node head) {
        int count = 0;
        while (head.next != null) {
            count++;
        }
        return count;
    }

    static Node deleteNode(Node head) {

        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return null;
        }
        Node copyNode = head;
        int count = count(head);
        System.out.println(count);
        int mid = count / 2;

        while (mid-- > 1) {
            head = head.next;
        }
        head.next = head.next.next;

        return copyNode;

    }


    static void printList(Node ptr) {
        while (ptr != null) {
            System.out.println(ptr.data);
            ptr = ptr.next;
        }
    }

    public static void main(String ar[]) {

        Node head = newNode(1);
        head.next = newNode(2);
        head.next.next = newNode(3);
        head.next.next.next = newNode(4);
        printList(head);
        Node del=deleteNode(head);
        printList(del);
    }
}
