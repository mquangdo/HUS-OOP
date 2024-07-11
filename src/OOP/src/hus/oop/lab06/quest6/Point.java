package hus.oop.lab06.quest6;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(){

    }
    public String toString(){
        return "Point : (" + this.x + "," + this.y + ")";
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }
}
