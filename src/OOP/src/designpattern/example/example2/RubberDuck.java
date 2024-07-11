package designpattern.example.example2;

public class RubberDuck extends Duck implements Quackable {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
}
