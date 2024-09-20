package CircularLinkedList;

public class Test {
    public static void main(String[] args) {
        CircularLinkedList list = new CircularLinkedList();
        list.addToHead(1);
        list.addToHead(2);
        list.addToHead(3);
        System.out.println(list);
        list.display();
    }
}
