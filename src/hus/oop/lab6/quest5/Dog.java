package hus.oop.lab6.quest5;

public class Dog extends Mammal{
    public Dog(String name){
        super.setName(name);
    }
    public void greets(){
        System.out.println("Woof");
    }
    public void greets(Dog anotherDog){
        System.out.println("Woooof");
    }
    @Override
    public String toString(){
        return "Dog[" + super.toString() + "]";
    }
}
