package hus.oop.lab6.quest5;

public class TestAnimal {
    public static void main(String[] args) {
        Animal a = new Animal("Four legs animal");
        System.out.println(a);
        Mammal m = new Mammal("Mammal");
        System.out.println(m);
        Dog d = new Dog("James");
        System.out.println(d);
        Cat c = new Cat("Kwang");
        System.out.println(c);
    }
}
