package hus.oop.lab07.quest1;

abstract class Shape {
    protected String color = "red";
    protected boolean filled = true;

    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public String getColor() {
        return color;
    }
    abstract double getArea();
    abstract double getPerimeter();

    @Override
    public String toString() {
        return "Shape[" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ']';
    }
}

