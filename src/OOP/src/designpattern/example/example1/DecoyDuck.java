package designpattern.example.example1;

public class DecoyDuck extends Duck{

    @Override
    public void display() {
        System.out.println("DecoyDuck");
    }

    public void quack(){
        System.out.println("Nothing");
    }

    public void fly(){
        System.out.println("Nothing");
    }
}
