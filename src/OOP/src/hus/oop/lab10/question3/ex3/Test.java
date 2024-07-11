package hus.oop.lab10.question3.ex3;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Host host = new Host();
        int[] a = new int[] {1, 2, 5, 4, 3, 8, 6, 7, 10, 9};
        host.setStrategy(new BubbleSort());
        System.out.println("Bubble Sort");
        System.out.println(Arrays.toString(host.sort(a)));
        host.setStrategy(new InsertionSort());
        System.out.println("Insertion Sort");
        System.out.println(Arrays.toString(host.sort(a)));
        host.setStrategy(new SelectionSort());
        System.out.println("Selection Sort");
        System.out.println(Arrays.toString(host.sort(a)));
    }
}
