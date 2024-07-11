package hus.oop.lab06.quest5;

public class Mammal extends Animal {
    public Mammal(){

    }
    public Mammal(String name){
        super.setName(name);
    }

    @Override
    public String toString(){
        return "Mammal[" + super.toString() + "]";
    }
}
