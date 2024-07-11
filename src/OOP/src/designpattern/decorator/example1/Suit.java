package designpattern.decorator.example1;

public abstract class Suit implements Troop{
    protected Troop troop;
    public Troop getTroop() {
        return this.troop;
    }
}
