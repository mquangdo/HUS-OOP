package hus.oop.lab6.quest1;

import hus.oop.lab6.quest4.Circle;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        System.out.println(c1);
        c1.setRadius(4);
        System.out.println("The new radius is: " + c1.getRadius());
        System.out.println("The area is: " + c1.getArea());
        System.out.println("The perimeter is: " + c1.getPerimeter());
        System.out.println("The color is: " + c1.getColor());
        c1.setColor("blue");
        System.out.println("The new color is: " + c1.getColor());
    }
}
