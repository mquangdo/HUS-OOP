package hus.oop.lab7.quest5;

public class TestCircle {
    public static void main(String[] args) {
        GeometricObject circle = new Circle(7);
        System.out.println(circle);
        System.out.println("The circle's area is: " + circle.getArea());
        System.out.println("The circle's perimeter is: " + circle.getPerimeter());

    }
}
