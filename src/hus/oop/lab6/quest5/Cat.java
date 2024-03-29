package hus.oop.lab6.quest5;

public class Cat extends Mammal{
    public Cat(String name){
        super.setName(name);
    }
    public void greets(){
        System.out.println("Meow");
    }
    @Override
    public String toString(){
        return "Cat[" + super.toString() + "]";
    }
}
