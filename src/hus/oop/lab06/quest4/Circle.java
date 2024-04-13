package hus.oop.lab06.quest4;

public class Circle extends Shape{
    private double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea(){
        return this.radius * this.radius * Math.PI;
    }
    public double getPerimeter(){
        return this.radius * 2 * Math.PI;
    }

    @Override
    public String toString(){
        return String.format("Circle[Shape[color=%s,filled=%b],radius=%.2f]", super.getColor(), super.isFilled(), this.radius);
    }
}
