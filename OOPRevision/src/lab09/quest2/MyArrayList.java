package lab09.quest2;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    int size;
    Object[] elements;


    @Override
    public void add(Object o) {
        if (size >= elements.length){
            enlarge();
        }
        elements[size++] = o;
    }

    @Override
    public void add(Object o, int index) {
        checkBoundaries(index, size);
        if (size >= elements.length){
            enlarge();
        }
        for (int i = size; i > index; i--){
            elements[i] = elements[i - 1];
        }
        elements[index] = o;
        size++;
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, size - 1);
        for (int i = index + 1; i < size; i++){
            elements[i - 1] = elements[i];
        }
        size--;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, size - 1);
        return elements[index];
    }

    @Override
    public int size() {
        return size;
    }
    void enlarge(){
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp,0, elements.length);
        elements = tmp;
    }
}
