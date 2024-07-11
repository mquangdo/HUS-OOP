package hus.oop.lab11.iterator.question3;

import java.util.Objects;

public class MyChickenListIterator implements Iterator{
    private String[] list;
    private int position = 0;
    public MyChickenListIterator(String[] list){
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        if (position >= list.length || list[position] == null){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        if (hasNext()){
            String elem = list[position];
            position++;
            return elem;
        }
        return null;
    }
}
