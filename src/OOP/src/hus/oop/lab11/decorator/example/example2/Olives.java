package hus.oop.lab11.decorator.example.example2;

public class Olives extends ToppingDecorator{

    public Olives(Pizza pizza){
        this.pizza = pizza;
    }
    @Override
    public double cost() {
        return pizza.cost() + 3.0;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olives";
    }
}
