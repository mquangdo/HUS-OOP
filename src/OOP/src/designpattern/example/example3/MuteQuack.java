package designpattern.example.example3;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("Cant quack");
    }
}
