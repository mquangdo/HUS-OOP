package designpattern.iterator.example1;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println(list.size());
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();
        System.out.println();
        Iterator iterator = list.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
