package LinkedList;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(new ListNode(1));
        list.insertAtEnd(new ListNode(2));
        list.insertAtEnd(new ListNode(3));
        System.out.println(list);
    }
}
