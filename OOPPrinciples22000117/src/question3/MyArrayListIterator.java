package question3;

public class MyArrayListIterator implements MyIterator {
    private Object[] data;
    private int currentPosition;
    public MyArrayListIterator(Object[] obj){

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }
}
