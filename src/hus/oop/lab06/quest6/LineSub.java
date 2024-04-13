package hus.oop.lab06.quest6;

public class LineSub extends Point{
    public static void main(String[] args) {
        LineSub ls = new LineSub(1,1,2,2);
        System.out.println(ls.getBegin().getX());
    }
    Point end;
    public LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub(Point begin, Point end){
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getBegin(){
        return new Point(super.getX(), super.getY());
    }

}
