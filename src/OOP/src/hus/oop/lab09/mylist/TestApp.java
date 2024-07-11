package hus.oop.lab09.mylist;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class TestApp {
    public static void main(String[] args) {
        MyList l = new MyLinkedList();
        l.add("b",0);
        l.add("c", 0);
        l.add("a", 0);
        System.out.println(l);
    }
}
