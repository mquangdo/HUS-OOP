package hus.oop.lab6.quest6;

public class Line {
    private Point begin;
    private Point end;
    public Line(Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }
    public Line(int beginX, int beginY, int endX, int endY){
        this.begin = new Point(beginX, beginY);
        this.end = new Point(endX, endY);
    }

    public Point getBegin(){
        return this.begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }
    public int getBeginX(){
        return this.begin.getX();
    }
    public int getBeginY(){
        return this.begin.getY();
    }
    public int getEndX(){
        return this.end.getX();
    }
    public int getEndY(){
        return this.end.getY();
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public void setBeginXY(int x, int y){
        setBeginX(x);
        setBeginY(y);
    }
    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setEndXY(int x, int y){
        setEndX(x);
        setEndY(y);
    }
    public double getLength(){
        double dx = getBeginX() - getEndX();
        double dy = getBeginY() - getEndY();
        double squared = dx * dx + dy * dy;
        return Math.sqrt(squared);
    }
    public double getGradient(){
        double dx = getBeginX() - getEndX();
        double dy = getBeginY() - getEndY();
        return Math.atan2(dy, dx);
    }
}
