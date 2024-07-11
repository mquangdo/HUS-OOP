package hus.oop.lab11.iterator.question3;

public class MyPizzaListIterator implements Iterator{
    private String[] list;
    private int position = 0;
    public MyPizzaListIterator(String[] list){
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
