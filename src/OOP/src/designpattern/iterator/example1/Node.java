package designpattern.iterator.example1;

public class Node {
    public Node next;
    public int val;

    public Node(){

    }

    public Node(int val){
        this.val = val;
    }
    public Node(Node next, int val){
        this.next = next;
        this.val = val;
    }
}
