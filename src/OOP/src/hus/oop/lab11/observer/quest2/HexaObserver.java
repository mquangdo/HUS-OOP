package hus.oop.lab11.observer.quest2;

public class HexaObserver extends Observer {
    public HexaObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Updated status.");
    }
}
