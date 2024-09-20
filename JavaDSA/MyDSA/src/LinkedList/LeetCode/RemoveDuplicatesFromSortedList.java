package LinkedList.LeetCode;

import org.w3c.dom.ls.LSException;

import java.util.List;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        node1.next = node2;
        node2.next = node3;
        node1.printList(deleteDuplicates(node1));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;

        while (temp != null && temp.next != null) {
            if (temp.val == temp.next.val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
