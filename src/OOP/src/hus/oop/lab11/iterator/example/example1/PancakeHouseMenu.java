package hus.oop.lab11.iterator.example.example1;
import java.util.List;
import java.util.ArrayList;
public class PancakeHouseMenu implements Menu{
    private List<String> menuItems;

    public PancakeHouseMenu(){
        menuItems = new ArrayList<String>();
        addItem("K&B's Pancake Breakfast");
        addItem("Regular Pancake Breakfast");
        addItem("Blueberry Pancakes");
        addItem("Waffles");
    }

    public void addItem(String name){
        menuItems.add(name);
    }

    public List<String> getMenuItems(){
        return menuItems;
    }

    public Iterator createIterator(){
        return new PancakeHouseMenuIterator(menuItems);
    }

    public String toString(){
        return "Pancake House Menu";
    }

}
