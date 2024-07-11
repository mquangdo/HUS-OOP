package hus.oop.lab11.observer.quest1;

public class ConcreteSubscriber1 implements Subscriber {
    @Override
    public void update(int state) {
        System.out.println("Concrete Subscriber 1 updated state " + state);
    }
}
