package hus.oop.lab11.decorator.example.example1;

public class ConcreteDecorator extends BaseDecorator{
    protected ConcreteDecorator(AbstractComponent component) {
        super(component);
    }

    @Override
    public void execute(){
        super.execute();
        System.out.println("[ADDITIONAL CODE BLOCK]");
    }
}
