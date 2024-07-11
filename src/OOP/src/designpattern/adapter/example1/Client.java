package designpattern.adapter.example1;

public class Client {
    public static void main(String[] args) {
        SquarePeg squarePeg = new SquarePeg(10);
        RoundHole roundHole = new RoundHole(4);
        RoundPeg roundPeg = new RoundPeg(4);
        SquarePegAdapter squarePegAdapter = new SquarePegAdapter(squarePeg);
        System.out.println(roundHole.fits(roundPeg));
        System.out.println(roundHole.fits(squarePegAdapter));
    }
}
