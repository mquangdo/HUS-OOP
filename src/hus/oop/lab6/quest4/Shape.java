package hus.oop.lab6.quest4;

public class Shape {
    private String color = "red";
    private boolean filled = true;
    public Shape(){

    }
    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    @Override
    public String toString(){
        return String.format("Shape[color=%s,filled=%b]", this.color, this.filled);
    }
}
