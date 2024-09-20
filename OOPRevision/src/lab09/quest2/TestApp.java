package lab09.quest2;

import java.util.ArrayList;

public class TestApp {
    public static void main(String[] args) {
        MyList l = new MyLinkedList();
        l.add("b");
        l.add("a", 0);
        System.out.println(l);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(0, 1);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }
}
