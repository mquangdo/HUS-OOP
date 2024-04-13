package hus.oop.lab07.quest3;

public class TestMain {
    public static void main(String[] args) {
        Movable movable = new MovablePoint(10,10,1,1);
        System.out.println("The current pos is: " + movable);
        movable.moveDown();
        movable.moveLeft();
        System.out.println("The new pos is: " + movable);
    }
}
