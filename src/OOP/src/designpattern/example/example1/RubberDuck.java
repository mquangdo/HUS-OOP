package designpattern.example.example1;

public class RubberDuck extends Duck {
    @Override
    public void display() {
        System.out.println("RubberDuck");
    }
    public void quack(){
        System.out.println("Squeak");
    }
    public void fly(){
        System.out.println("Nothing");
    }
}
