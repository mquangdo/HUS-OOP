package DoublyLinkedList.LeetCode;

import LinkedList.LeetCode.ListNode;

public class Node {
    int data;
    Node next, prev;

    public Node(int d) {
        data = d;
        next = prev = null;
    }


    void printList(Node node){
        Node temp = node;
        while (temp != null){
            System.out.print(temp.data);
            temp = temp.next;
        }
    }
}