package theory.collectionframework;

import java.util.*;

public class section1_5 {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(3);
        ls.add(2);
        ls.add(1);
        Collections.sort(ls);
        System.out.println(Collections.binarySearch(ls,3));
        System.out.println(ls);
    }
}
