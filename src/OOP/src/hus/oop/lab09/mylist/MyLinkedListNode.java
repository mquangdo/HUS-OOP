package hus.oop.lab09.mylist;

public class MyLinkedListNode {
    Object payload;
    MyLinkedListNode next;

    public MyLinkedListNode(Object payload){
        this.payload = payload;
        this.next = null;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next){
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload(){
        return this.payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }

}
