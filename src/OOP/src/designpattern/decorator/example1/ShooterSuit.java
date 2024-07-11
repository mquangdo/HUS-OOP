package designpattern.decorator.example1;

public class ShooterSuit extends Suit{

    public ShooterSuit(Troop troop){
        this.troop = troop;
    }

    @Override
    public String getDescription() {
        return troop.getDescription() + " Shooter Mode";
    }
}
