package hus.oop.lab07.quest4;

public class TestMain {
    public static void main(String[] args) {
        Movable movablePoint = new MovablePoint(7,7, 1, 1);
        System.out.println("The current pos is: " + movablePoint);
        movablePoint.moveDown();
        movablePoint.moveLeft();
        System.out.println("The new pos is: " + movablePoint);

        Movable movableCircle = new MovableCircle(7,7,1,1,5);
        System.out.println(movableCircle);
        System.out.println("The current pos is: " + movableCircle);
        movableCircle.moveDown();
        movableCircle.moveLeft();
        System.out.println("The new pos is: " + movableCircle);
    }
}
