package designpattern.decorator.example1;

public class FighterSuit extends Suit{

    public FighterSuit(Troop troop){
        this.troop = troop;
    }

    @Override
    public String getDescription() {
        return troop.getDescription() + " Fighter Mode";
    }
}
