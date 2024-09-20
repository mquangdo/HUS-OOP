package LinkedListBrownBox;

public class MyLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        n1.next = n2;
        n2.next = n3;
        n3.next = null;
        Node node = addToHead(n1,4);
        printList(node);
        n1 = addToTail(n1, 0);
        printList(n1);
        System.out.println();
        n1 = addToIndex(n1,9, 2);
        printList(n1);
    }

    public static void printList(Node head){
        if (head == null){
            System.out.println("List is empty!");
        }
        else {
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data);
                temp = temp.next;
                if (temp != null){
                    System.out.print("->");
                }else {
                    System.out.print("");
                }
            }
        }
    }
    public static Node addToHead(Node head, int data){
        Node newNode = new Node(data);
        if (head == null){
            return newNode;
        }
        else {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node addToTail(Node head, int data){
        Node newNode = new Node(data);
        if (head == null){
            return newNode;
        }
        else {
            Node lastNode = head;
            while (lastNode.next != null){
                lastNode = lastNode.next;
            }
            lastNode.next = newNode;
        }
        return head;
    }

    public static Node addToIndex(Node head, int data, int index){
        if (index == 0){
            return addToHead(head, data);
        }
        else {
            Node cur = head;
            int count = 0;
            while (cur != null){
                count++;
                if (count == index){
                    Node newNode = new Node(data);
                    newNode.next = cur.next;
                    cur.next = newNode;
                }
                cur = cur.next;
            }
        }
        return head;
    }
}
