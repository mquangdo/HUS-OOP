package designpattern.decorator.example1;

public class FighterTroop implements Troop{
    protected String description = "Fighter";

    @Override
    public String getDescription() {
        return this.description;
    }
}
