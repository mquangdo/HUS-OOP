package hus.oop.lab09.mylist;

public class MyLinkedList extends MyAbstractList{
    MyLinkedListNode head;
    int size;

    public MyLinkedList(){
        head = null;
        size = 0;
    }

    private MyLinkedListNode getNodeByIndex(int index){
        checkBoundaries(index, size - 1);
        MyLinkedListNode current = head;
        for (int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current;
    }

    @Override
    public void add(Object o){
        add(o, size);
    }

    @Override
    public void add(Object o, int index){
        checkBoundaries(index, size);
        if(index == 0){
            head = new MyLinkedListNode(o, head);
        } else {
            MyLinkedListNode current = getNodeByIndex(index - 1);
            MyLinkedListNode newNode = new MyLinkedListNode(o, current.getNext());
            current.setNext(newNode);
        }
        size++;
    }
    @Override
    public Object get(int index){
        return getNodeByIndex(index).payload;
    }

    @Override
    public void remove(int index){
        if (index == 0){
            head = head.getNext();
        }
        else if (index == size - 1){
            MyLinkedListNode curNode = getNodeByIndex(index - 1);
            curNode.setNext(null);
        }
        else {
            MyLinkedListNode previous = getNodeByIndex(index - 1);
            MyLinkedListNode after = getNodeByIndex(index + 1);
            previous.setNext(after);
        }
        size--;
    }

    @Override
    public int size(){
        return size;
    }
}
