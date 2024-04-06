package hus.oop.lab7.quest8;

public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();

    default void show(){
        System.out.println("show");
    }
}
