package hus.oop.lab11.decorator.question2;

public class VanillaIceCream extends IceCream{
    private String description = "Vanilla";
    @Override
    public String getDescription() {
        return super.description + " " + this.description;
    }
}
