package theory.collectionframework;

import java.util.*;

public class section1_3 {
    public static void main(String[] args) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder("alpha"));
        list.add(new StringBuilder("beta"));
        list.add(new StringBuilder("charlie"));

        for (StringBuilder str: list){
            str.append(123);
        }
        System.out.println(list);
    }
}
