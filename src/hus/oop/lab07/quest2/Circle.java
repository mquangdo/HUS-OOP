package hus.oop.lab07.quest2;

public class Circle implements GeometricObject{
    private double radius;

    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle[" +
                "radius=" + radius +
                ']';
    }
}
