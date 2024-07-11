package hus.oop.lab11.iterator.example.example1;

public class DinnerMenu  implements Menu{
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    String[] menuItems;

    public DinnerMenu(){
        menuItems = new String[MAX_ITEMS];
        addItem("Vegetarian BLT");
        addItem("BLT");
        addItem("Soup of the day");
        addItem("Hotdog");
    }

    public void addItem(String name){
        if (numberOfItems >= MAX_ITEMS){
            System.err.println("Sorry, menu is full! Can't add item to menu");
        } else {
            menuItems[numberOfItems] = name;
            numberOfItems += 1;
        }
    }

    public String[] getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator(){
        return new DinnerMenuIterator(menuItems);
    }

    public String toString(){
        return "Dinner Menu";
    }
}
