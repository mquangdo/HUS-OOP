package designpattern.example.example3;

public class Quack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
