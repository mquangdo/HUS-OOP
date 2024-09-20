package question2;

import java.util.Arrays;

public class ArrayDataSet {
    private int DEFAULT_CAPACITY;
    private double[] data;
    private int size;

    public ArrayDataSet(){

    }

    public ArrayDataSet(int DEFAULT_CAPACITY, double[] data, int size) {
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
        this.data = data;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "ArrayDataSet{" +
                "DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                ", data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public double[] getData() {
        return data;
    }

    public void setData(double[] data) {
        this.data = data;
    }

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public void setDEFAULT_CAPACITY(int DEFAULT_CAPACITY) {
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
    }
}
