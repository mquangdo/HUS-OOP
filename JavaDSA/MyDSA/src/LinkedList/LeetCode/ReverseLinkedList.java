package LinkedList.LeetCode;

public class ReverseLinkedList {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode cur = head;

        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
