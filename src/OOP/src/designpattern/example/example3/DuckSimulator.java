package designpattern.example.example3;

import java.util.LinkedList;
import java.util.List;

public class DuckSimulator {
    public static void main(String[] args) {
        List<Duck> ducks = new LinkedList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new DecoyDuck());
        ducks.add(new RubberDuck());

        for (Duck duck: ducks){
            duck.display();
            duck.swim();
            duck.performFly();
            duck.performQuack();
            System.out.println();
        }
    }
}
