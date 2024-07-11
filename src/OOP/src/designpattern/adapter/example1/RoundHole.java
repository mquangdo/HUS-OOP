package designpattern.adapter.example1;

public class RoundHole {
    private int radius;
    public RoundHole(int radius){
        this.radius = radius;
    }

    public int getRadius(){
        return this.radius;
    }

    public boolean fits(RoundPeg peg){
        return peg.getRadius() <= this.radius;
    }
}
