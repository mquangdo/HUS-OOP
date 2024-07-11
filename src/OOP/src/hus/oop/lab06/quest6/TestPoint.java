package hus.oop.lab06.quest6;

public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point(10, 10);
        System.out.println(p1);
        System.out.println("The x pos is: " + p1.getX());
        System.out.println("The y pos is: " + p1.getY());
        p1.setY(5);
        System.out.println(p1);
        System.out.println("The new y pos is: " + p1.getY());
    }
}
