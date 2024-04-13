package hus.oop.lab07.quest2;

public class TestMain {
    public static void main(String[] args) {
        GeometricObject obj = new Circle(5);
        System.out.println(obj);
        System.out.println("Circle's area is: " + obj.getArea());
        System.out.println("Circle's circumference is: " + obj.getPerimeter());

        GeometricObject obj2 = new Rectangle(4,3);
        System.out.println(obj2);
        System.out.println("Rectangle's area is: " + obj.getArea());
        System.out.println("Rectangle's perimeter is: " + obj.getPerimeter());
    }
}
