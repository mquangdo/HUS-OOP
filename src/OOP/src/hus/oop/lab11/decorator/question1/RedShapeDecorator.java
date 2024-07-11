package hus.oop.lab11.decorator.question1;

public class RedShapeDecorator implements ShapeDecorator{
    private Shape shape;

    public RedShapeDecorator(Shape shape){
        this.shape = shape;
    }
    @Override
    public void draw() {
        shape.draw();
        setRedBorder();
    }
    public void setRedBorder(){
        System.out.println("RedBorder");
    }
}
