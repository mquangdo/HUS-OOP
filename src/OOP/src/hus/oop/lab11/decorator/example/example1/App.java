package hus.oop.lab11.decorator.example.example1;

public class App {
    public static void main(String[] args) {
        AbstractComponent component = new ConcreteComponent();
        BaseDecorator decorator = new ConcreteDecorator(component);
        decorator.execute();
    }
}
