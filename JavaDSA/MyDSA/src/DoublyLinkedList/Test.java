package DoublyLinkedList;

public class Test {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertHead(1);
        list.insertHead(2);
        list.removeHead();
        System.out.println(list);
    }
}
