package hus.oop.lab07.quest6;

public class Cat extends Animal{
    public Cat(String name){
        super(name);
    }
    @Override
    void greets() {
        System.out.println("Meow");
    }
}
