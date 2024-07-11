package hus.oop.lab11.decorator.question1;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
        Shape rectangle = new Rectangle();
        rectangle.draw();
        Shape redBorder = new RedShapeDecorator(circle);
        System.out.println();
        redBorder.draw();
    }
}
