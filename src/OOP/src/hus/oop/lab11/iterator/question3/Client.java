package hus.oop.lab11.iterator.question3;


public class Client {
    public static void main(String[] args) {
        String[] pizza = {"CheesePizza", "SausagePizza"};
        String[] chicken = {"Fried", "Wings","Nuggets"};
        MyList pizzaList = new MyPizzaList(pizza);
        MyList chickenList = new MyChickenList(chicken);

        Iterator pizzaIterator = pizzaList.createIterator();
        Iterator chickenIterator = chickenList.createIterator();

        while (pizzaIterator.hasNext()){
            System.out.println(pizzaIterator.next());
        }
        System.out.println();

        while (chickenIterator.hasNext()){
            System.out.println(chickenIterator.next());
        }
    }
}
