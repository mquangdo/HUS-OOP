package hus.oop.lab11.decorator.question2;

public class NutsToppingDecorator extends ToppingDecorator{
    private IceCream iceCream;

    public NutsToppingDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }
    @Override
    public String getDescription() {
        return iceCream.getDescription() + " " +  addTopping();
    }

    @Override
    public String addTopping() {
        return "add Nuts";
    }
}
