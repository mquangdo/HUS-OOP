package designpattern.example.example2;

public class RedheadDuck extends Duck implements Flyable, Quackable{
    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void display() {
        System.out.println("RedheadDuck");
    }
}
