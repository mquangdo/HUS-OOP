package designpattern.strategy.example1;

public class Zed implements Champion{
    @Override
    public void role() {
        System.out.println("Assassin");
    }

    @Override
    public void lane() {
        System.out.println("Mid lane");
    }

    @Override
    public void Q() {
        System.out.println("Razor Shuriken");
    }

    @Override
    public void W() {
        System.out.println("Living Shadow");
    }

    @Override
    public void E() {
        System.out.println("Shadow Slash");
    }

    @Override
    public void R() {
        System.out.println("Death Mark");
    }
}
