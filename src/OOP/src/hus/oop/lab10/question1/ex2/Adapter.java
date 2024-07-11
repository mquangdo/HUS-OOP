package hus.oop.lab10.question1.ex2;

public class Adapter extends Target {
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void execute() {
        adaptee.specificExecute();
    }
}
