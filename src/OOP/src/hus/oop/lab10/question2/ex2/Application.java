package hus.oop.lab10.question2.ex2;

public class Application {
    public static void main(String[] args) {
        Database foo = Database.getInstance();
        foo.query();

        Database bar = Database.getInstance();
        bar.query();

        System.out.println(foo == bar);
    }
}
