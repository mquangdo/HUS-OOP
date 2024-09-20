package LinkedListBasicOperations;

import javax.swing.*;

public class Insertion {

}
class Node{
    int data;
    Node next;

    public Node(){

    }

    public Node(int data){
        this.data = data;
    }
    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    static void printList(Node n) {
        // Iterate till n reaches null
        while (n != null) {
            // Print the data
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
}

class LinkedList{
    Node head = null;
    void insertAtFront(int new_data)
    {
        // 1. allocate node
        Node new_node = new Node();

        // 2. put in the data
        new_node.data = new_data;

        // 3. Make next of new node as head
        new_node.next = head;

        // 4. move the head to point
        // to the new node
        head = new_node;
    }
    void insertionEnd(int data){
        Node temp = head;
        Node lastNode = new Node(data);
        while (temp.next != null){
            temp = temp.next;
            if (temp.next == null){
                temp.next = lastNode;
                lastNode.next = null;
            }
        }
    }

    void append(int new_data)
    {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new_node;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = new_node;
    }

    void printList()
    {
        Node node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.printList();
        list.insertAtFront(2);
        list.printList();
    }
}
