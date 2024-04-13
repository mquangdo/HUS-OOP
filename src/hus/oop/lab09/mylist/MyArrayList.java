package hus.oop.lab09.mylist;

public class MyArrayList extends MyAbstractList{
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList(){
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object object, int index) {
        if (size < elements.length){
            size++;
        }
        for (int i = size - 1; i > index; i--){
            elements[i] = elements[i - 1];
        }
        elements[index] = object;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public void add(Object object) {
        if(size >= elements.length - 1){
            enlarge();
        }
        elements[size++] = object;
    }

    void enlarge(){
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
    }
}
