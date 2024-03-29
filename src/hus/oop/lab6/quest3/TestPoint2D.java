package hus.oop.lab6.quest3;

import java.nio.channels.Pipe;

public class TestPoint2D {
    public static void main(String[] args) {
        Point2D point2D = new Point2D(1,1);
        System.out.println("The x pos is: " + point2D.getX());
        System.out.println("The y pos is: " + point2D.getY());
        point2D.setX(2);
        System.out.println(point2D);
        point2D.setXY(3,4);
        System.out.println(point2D);
    }
}
