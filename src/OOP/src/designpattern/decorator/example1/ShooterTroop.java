package designpattern.decorator.example1;

public class ShooterTroop implements Troop{
    protected String description = "Shooter";
    @Override
    public String getDescription() {
        return this.description;
    }
}
