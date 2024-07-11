package designpattern.iterator.example1;

public class LinkedList implements Iterable{
    private Node head;

    private int size = 0;
    public LinkedList(){
        this.head = null;
        this.size = 0;
    }

    public void add(int val){
        Node newNode = new Node(val);
        if (size == 0){
            head = newNode;
        }
        else {
            Node prev = getNodeByIndex(size - 1);
            prev.next = newNode;
        }
        size++;
    }

    public Node getNodeByIndex(int index){
        Node temp = head;
        if (index >= size || index < 0){
            return null;
        }
        for (int i = 0; i < index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            if (temp.next == null){
                System.out.print(temp.val);
                temp = temp.next;
            }
            else {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
        }
    }

    public int size(){
        return this.size;
    }

    @Override
    public Iterator createIterator() {
        return new LinkedListIterator(head);
    }

    public Node getHead(){
        return this.head;
    }
}
