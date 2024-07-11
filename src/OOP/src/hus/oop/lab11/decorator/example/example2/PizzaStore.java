package hus.oop.lab11.decorator.example.example2;

public class PizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new ThincrustPizza();
        Pizza cheesePizza = new Cheese(pizza);
        Pizza greekPizza = new Olives(pizza);

        System.out.println(greekPizza.getDescription() + " $" + greekPizza.cost());
    }
}
