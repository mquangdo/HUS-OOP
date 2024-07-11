package hus.oop.lab07.quest5;

public class TestResizableCircle {
    public static void main(String[] args) {
        Resizable circle = new ResizableCircle(7);
        System.out.println(circle);
        circle.resize(50);
        System.out.println(circle);

    }
}
