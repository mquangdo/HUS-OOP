package question3;

public class MyLinkedListNode {
    private Object payload;
    private MyLinkedListNode next;
    public MyLinkedListNode(Object obj){

    }

    public MyLinkedListNode(Object obj, MyLinkedListNode node){

    }

    public MyLinkedListNode getNext(){
        return next;
    }

    public Object getPayload(){
        return this.payload;
    }

    public void setNext(MyLinkedListNode node){
        this.next = node;
    }
}
