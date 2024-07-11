package hus.oop.lab11.decorator.example.example1;

public class ConcreteComponent extends AbstractComponent{
    @Override
    public void execute() {
        System.out.println("ConcreteComponent.execute()");
    }
}
