package hus.oop.lab11.decorator.question2;

public class ChocolateIceCream extends IceCream {
    private String description = "Chocolate";
    @Override
    public String getDescription() {
        return super.description + " " + this.description;
    }
}
