package LinkedList.LeetCode;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode node1 = new ListNode(7);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(7);
        ListNode node4 = new ListNode(7);

        node1.printList(removeElements(node1, 7));
    }

    public static ListNode removeElements(ListNode head, int val) {
        head = removeAtBegin(head, val);

        ListNode temp = head;
        while (temp != null && temp.next != null) {
            if (temp.next.val == val) {
                temp.next = temp.next.next;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }

    public static ListNode removeAtBegin(ListNode head, int val){
        while (head != null){
            if (head.val == val){
                head = head.next;
            }
        }
        return head;
    }
}
