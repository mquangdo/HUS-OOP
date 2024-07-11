package hus.oop.lab11.iterator.question3;

public class MyPizzaList extends MyList{
    private String[] pizzaList;
    public MyPizzaList(String[] pizzaList){
        this.pizzaList = pizzaList;
    }

    public void getDescription() {
        System.out.println("PizzaList");
    }

    @Override
    public Iterator createIterator() {
        return new MyPizzaListIterator(pizzaList);
    }
}
