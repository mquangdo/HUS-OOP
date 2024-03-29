package hus.oop.lab6.quest4;

public class Rectangle extends Shape{
    private double width = 1.0;
    private double length = 1.0;
    public Rectangle(){

    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    public double geArea(){
        return this.length * this.width;
    }
    public double getPerimeter(){
        return 2 * (this.length + this.width);
    }

    @Override
    public String toString(){
        return String.format("Rectangle[Shape[color=%s,filled=%b],width=%.2f,length=%.2f]", super.getColor(), super.isFilled(), this.width, this.length);
    }

}
