package hus.oop.lab10.question1.ex1;

public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg){
        return peg.getRadius() <= this.radius;
    }
}
