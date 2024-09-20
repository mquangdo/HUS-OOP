package lab09.quest2;

public class MyLinkedList extends MyAbstractList{
    int size;
    MyLinkedListNode head;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index){
        checkBoundaries(index, size);
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public void add(Object o, int index) {
        if (index == 0){
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(new MyLinkedListNode(o, current.getNext()));
        }
        size++;
    }

    @Override
    public void remove(int index) {
        if (index == 0){
            head = head.getNext();
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            current.setNext(current.getNext().getNext());
        }
    }

    @Override
    public Object get(int index) {
        return getNodeByIndex(index).getPayload();
    }

    @Override
    public int size() {
        return size;
    }
}
