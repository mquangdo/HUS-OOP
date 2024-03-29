package hus.oop.lab6.quest4;

public class Square extends Rectangle{
    private double side;
    public Square(){

    }
    public Square(double side){
        super(side, side);
    }
    public Square(double side, String color, boolean filled){
        super(side, side, color, filled);
    }
    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setWidth(double side){
        super.setWidth(side);
    }
    public void setLength(double side){
        super.setLength(side);
    }

    @Override
    public String toString(){
        return String.format("Square[Rectangle[Shape[color=%s,filled=%b],width=%.2f,length=%.2f]]", super.getColor(), super.isFilled(), super.getWidth(), super.getLength());
    }

}
