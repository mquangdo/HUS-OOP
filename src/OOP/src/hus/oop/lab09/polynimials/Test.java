package hus.oop.lab09.polynimials;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String name = "Quang";
        String newName = String.format("My name is not %s","Quang");
        float myFloat = 1.34f;
        int myInt = -1;
        System.out.printf("%.5f\n", myFloat);
        System.out.printf("%.5f%n", myFloat);
        System.out.printf("%S", name);
        List<Integer> list = new ArrayList<>(10);
        System.out.println(list);
    }
}
