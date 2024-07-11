package designpattern.example.example3;

public class RedheadDuck extends Duck{
    public RedheadDuck(){
        quackBehavior = new Quack();
        flyBehavior =  new FlyWithWings();
    }
    @Override
    void display() {
        System.out.println("I'm a redhead duck");
    }
}
