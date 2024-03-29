package hus.oop.lab7.quest5;

public class Circle implements GeometricObject {
    protected double radius;

    public Circle(){

    }

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
