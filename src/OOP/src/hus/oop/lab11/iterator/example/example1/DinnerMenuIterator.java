package hus.oop.lab11.iterator.example.example1;

public class DinnerMenuIterator implements Iterator{
    private String[] items;
    private int position = 0;

    public DinnerMenuIterator(String[] items){
        this.items = items;
    }

    public String next(){
        String item = items[position];
        position += 1;
        return item;
    }
    public boolean hasNext() {
        if (position >= items.length || items[position] == null){
            return false;
        }
        return true;
    }

}
