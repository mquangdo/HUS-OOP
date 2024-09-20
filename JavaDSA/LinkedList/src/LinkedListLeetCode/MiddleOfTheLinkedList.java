package LinkedListLeetCode;

public class MiddleOfTheLinkedList {

}

class ListNode {
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

    public ListNode middleNode(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null){
            temp = temp.next;
            length++;
        }
        for (int i = 1; i <= length / 2; i++){
            assert head != null;
            head = head.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode();
        ListNode second = new ListNode();
        ListNode third = new ListNode();
        ListNode fourth = new ListNode();
        ListNode fifth = new ListNode();
        ListNode sixth = new ListNode();

        head.val = 1;
        head.next = second;

        second.val = 2;
        second.next = third;

        third.val = 3;
        third.next = fourth;

        fourth.val = 4;
        fourth.next = fifth;

        fifth.val = 5;
        fifth.next = sixth;

        sixth.val = 6;
        sixth.next = null;

        System.out.println(head.middleNode(head).val);
    }
}


