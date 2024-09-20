package DoublyLinkedList.LeetCode;

public class ReverseDoublyLinkedList {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        node1.prev = null;
        node1.next = node2;
        node2.prev = node1;
        node2.next = node3;
        node3.prev = node2;
        node3.next = null;
        node1.printList(node1);
    }

    public static Node reverse(Node head){
        Node prev = null;
        Node cur = head;
        while (cur != null){
            prev = cur.prev;
            cur.prev = cur.next;
            cur.next = prev;
            cur = cur.prev;
        }
        return prev;
    }
}
