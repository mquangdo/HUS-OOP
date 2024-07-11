package hus.oop.lab11.decorator.example.example2;

public abstract class ToppingDecorator extends Pizza {
    protected Pizza pizza;
    public abstract String getDescription();
}

