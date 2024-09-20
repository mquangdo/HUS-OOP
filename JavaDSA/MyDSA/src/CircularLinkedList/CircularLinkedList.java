package CircularLinkedList;

import DoublyLinkedList.DLLNode;

public class CircularLinkedList{
    protected CLLNode head;
    protected CLLNode tail;

    public int size;

    // Constructs a new circular list
    public CircularLinkedList(){
        head = null;
        tail = null;
        size = 0;
    }

    // Adds data to beginning of list.
    public void add(int data){
        addToHead(data);
    }

    // Adds element to head of list
    public void addToHead(int data){
        CLLNode newNode = new CLLNode(data);
        newNode.setNext(head);
        if (head == null){
            head = newNode;
            newNode.setNext(head);
            tail = head;
        }

        else {
            tail.setNext(newNode);
            head = newNode;
        }
        size++;
    }

    // Adds element to tail of list
    public void addToTail(int data){
        // new entry:
        CLLNode newNode = new CLLNode(data);

        if (isEmpty()){
            newNode.setNext(tail);
            head = newNode;
            tail = newNode;
            tail.setNext(head);
        }

        else {
            tail.setNext(newNode);
            newNode.setNext(head);
            tail = newNode;
        }
        size++;
    }

    public void insert(int data, int pos){
        CLLNode newNode = new CLLNode(data);
        if (pos == 0){
            addToHead(data);
        }
        else if (pos == size){
            addToTail(data);
        }
        else {
            CLLNode cur = head;
            for (int i = 0; i < pos - 1; i++){
                cur = cur.getNext();
                cur.setNext(newNode);
                newNode.setNext(cur.getNext());
            }
        }
        size++;
    }

    // Returns data at head of list
    public int peek(){
        return head.getData();
    }

    // Returns data at tail of list
    public int tailPeek(){
        return tail.getData();
    }

    // Returns and removes data from head of list
    public int removeFromHead(){
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }

        CLLNode temp = head; // ie. the head of the list
        if (head == head.getNext()) {
            head = null;
        } else {
            head = head.getNext();
            temp.setNext(head); // helps clean things up; temp is free
        }
        size--;
        return temp.getData();
    }

    // Returns and removes data from tail of list
    public int removeFromTail(){
        if (isEmpty()){
            return Integer.MIN_VALUE;
        }

        CLLNode temp = tail;

        if (head == head.getNext()){
            head = null;
        }
        else {
            CLLNode cur = head;
            while (cur.getNext() != tail){
                cur = cur.getNext();
            }
            cur.setNext(head);
        }
        return temp.getData();
    }

    // Returns true if list contains data, else false
    public boolean contains(int data){
        if (isEmpty()){
            return false;
        }
        CLLNode cur = head;
        while (cur.getNext() != head){
            cur = cur.getNext();
            if (cur.getData() == data){
                return true;
            }
        }
        return false;
    }

    // Removes and returns element equal to data, or null
    public int remove(int data){
        if (isEmpty()) return Integer.MIN_VALUE;
        CLLNode finger = tail.getNext();
        CLLNode previous = tail;
        int compares;
        for (compares = 0; compares < size && (!(finger.getData() == data)); compares++) {
            previous = finger;
            finger = finger.getNext();
        }
        if (finger.getData() == data) {
            // an example of the pigeon-hole principle
            if (tail == tail.getNext()) {
                tail = null; }
            else {
                if (finger == tail)
                    tail = previous;
                previous.setNext(previous.getNext().getNext());
            }
            // finger data free
            finger.setNext(null); 	// to keep things disconnected
            size--;            	// fewer elements
            return finger.getData();
        }
        else return Integer.MIN_VALUE;
    }

    // Return the current length of the CLL.
    public int size(){
        return size;
    }

    // Return the current length of the CLL.
    public int length() {
        return size;
    }

    // Returns true if no elements in list
    public boolean isEmpty(){
        return head == null;
    }

    // Remove everything from the CLL.
    public void clear(){
        size = 0;
        tail = null;
    }

    // Return a string representation of this collection, in the form: ["str1","str2",...].
    public void display(){
        System.out.print("\nCircular Singly Linked List = ");
        CLLNode ptr = head;
        if (size == 0)
        {
            System.out.print("empty\n");
            return;
        }
        if (head.getNext() == head)
        {
            System.out.print(head.getData()+ "->"+ptr.getData()+ "\n");
            return;
        }
        System.out.print(head.getData()+ "->");
        ptr = head.getNext();
        while (ptr.getNext() != head)
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getNext();
        }
        System.out.print(ptr.getData()+ "->");
        ptr = ptr.getNext();
        System.out.print(ptr.getData()+ "\n");
    }
}
