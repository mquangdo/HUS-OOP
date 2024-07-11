package hus.oop.lab11.observer.quest2;

public abstract class Observer {
    public Subject subject;

    public Observer(Subject subject) {
        this.subject = subject;
        subject.attach(this);
    }

    public abstract void update();
}
