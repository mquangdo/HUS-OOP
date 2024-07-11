package hus.oop.lab11.iterator.example.example1;

import java.util.ArrayList;
import java.util.List;

public class PancakeHouseMenuIterator implements Iterator{

    private List<String> items;
    private int position = 0;

    public PancakeHouseMenuIterator(List<String> items){
        this.items = items;
    }

    public Object next(){
        String item = items.get(position);
        position += 1;
        return item;
    }
    public boolean hasNext() {
        if (position >= items.size() || items.get(position) == null){
            return false;
        }
        return true;
    }
}
