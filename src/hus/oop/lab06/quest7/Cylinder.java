package hus.oop.lab06.quest7;
import hus.oop.lab06.quest4.Circle;

public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder(){
        base = new Circle();
        height = 1.0;
    }
    public Cylinder(double radius, double height){
        base = new Circle(radius);
        this.height = height;
    }
    public Cylinder(double radius, String color, double height, boolean filled){
        base = new Circle(radius, color, filled);
        this.height = height;
    }
    public double getHeight(){
        return this.height;
    }
    public void setHeight(double height){
        this.height = height;
    }
    public double getRadius(){
        return base.getRadius();
    }
    public void setRadius(double radius){
        base.setRadius(radius);
    }
    public double getBaseArea(){
        return base.getRadius() * base.getRadius() * Math.PI;
    }
    public double getAroundArea(){
        return base.getArea() * 2 * this.height * Math.PI;
    }
    public double getTotalArea(){
        return getAroundArea() + getBaseArea();
    }
    public String toString(){
        return "Cylinder: height =" + this.height + ",base = " + this.base;
    }
}
