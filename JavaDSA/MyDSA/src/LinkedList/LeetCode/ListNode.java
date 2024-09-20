package LinkedList.LeetCode;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    void printList(ListNode node){
        ListNode temp = node;
        while (temp != null){
            System.out.print(temp.val);
            temp = temp.next;
        }
    }
}
