package hus.oop.lab11.decorator.question2;

public class StrawBerryIceCream extends IceCream {
    private String description = "Strawberry";
    @Override
    public String getDescription() {
        return super.description + " " + this.description;
    }
}
