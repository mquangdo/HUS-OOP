package designpattern.strategy.example1;

public class Lucian implements Champion{
    @Override
    public void role() {
        System.out.println("Ad carry");
    }

    @Override
    public void lane() {
        System.out.println("Bot lane");
    }

    @Override
    public void Q() {
        System.out.println("Piercing Light");
    }

    @Override
    public void W() {
        System.out.println("Ardent Blaze");
    }

    @Override
    public void E() {
        System.out.println("Relentless pursuit");
    }

    @Override
    public void R() {
        System.out.println("The Culling");
    }
}
