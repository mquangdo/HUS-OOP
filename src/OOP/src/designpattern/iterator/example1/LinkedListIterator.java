package designpattern.iterator.example1;

import hus.oop.lab09.mylist.MyLinkedList;

public class LinkedListIterator implements Iterator{

    private Node head;
    private int position = 0;
    public LinkedListIterator(Node head){
        this.head = head;
    }
    @Override
    public boolean hasNext() {
        return head != null;
    }

    @Override
    public int next() {
        if (hasNext()){
            int val = head.val;
            head = head.next;
            return val;
        }
        return -1;
    }
}
