package hus.oop.lab13.review.mylist;

import java.util.Objects;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    private class MyArrayListIterator implements MyIterator{
        private int currentPosition;

        public MyArrayListIterator(int currentPosition){
            this.currentPosition = currentPosition;
        }


        @Override
        public boolean hasNext() {
            return this.currentPosition < size - 1;
        }

        @Override
        public Object next() {
            if (hasNext()){
                Object temp = data[currentPosition];
                currentPosition++;
                return temp;
            }
            return null;
        }
    }

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        /* TODO */
        this.data = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        if ((index < 0) || (index >= this.size)){
            return null;
        }
        return this.data[index];
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if ((index < 0) || (index >= this.size)){
            return;
        }
        for (int i = index; i < this.size - 1; i++){
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
    }
    /**
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        if (size == data.length){
            enlarge();
        }
        data[size] = payload;
        size++;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        if (size == data.length){
            enlarge();
        }
        for (int i = size; i > index; i--){
            data[i] = data[i - 1];
        }
        data[index] = payload;
        size++;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyArrayListIterator(0);
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        Object[] temp = new Object[2 * data.length];
        System.arraycopy(data,0, temp, 0, data.length);
        this.data = temp;
    }
}