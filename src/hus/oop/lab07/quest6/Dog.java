package hus.oop.lab07.quest6;

public class Dog extends Animal{
    public Dog(String name){
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Woof");
    }
    void greets(Dog anotherDog){
        System.out.println("Woooof");
    }
}
