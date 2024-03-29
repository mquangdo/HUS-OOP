package hus.oop.lab7.quest2;

public class Rectangle implements GeometricObject{
    private double length;
    private double width;

    public Rectangle(){

    }

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.width * this.length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.length);
    }

    @Override
    public String toString() {
        return "Rectangle[" +
                "length=" + length +
                ", width=" + width +
                ']';
    }
}
