package hus.oop.lab11.decorator.example.example1;

public abstract class BaseDecorator extends AbstractComponent {
    private final AbstractComponent component;
    protected BaseDecorator(AbstractComponent component){
        this.component = component;
    }

    @Override
    public void execute(){
        this.component.execute();
    }
}
