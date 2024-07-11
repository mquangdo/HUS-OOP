package lastterm.year2223.de3.mybookmanager;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

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
     *
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return this.size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     *
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        checkBoundaries(index, this.size - 1);
        return this.data[index];
    }

    /**
     * Sửa phần tử ở vị trí index là payload.
     *
     * @param payload
     * @param index
     */
    @Override
    public void set(Object payload, int index) {
        /* TODO */
        checkBoundaries(index, this.size - 1);
        this.data[index] = payload;
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     *
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        checkBoundaries(index, this.size - 1);
        for (int i = index; i < this.size; i++) {
            this.data[i] = this.data[i + 1];
        }
        this.size--;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào cuối list.
     * Nếu danh sách hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     *
     * @param payload
     */
    @Override
    public void append(Object payload) {
        /* TODO */
        if (this.data.length == this.size) {
            enlarge();
        }

        this.data[this.size] = payload;
        this.size++;
    }

    /**
     * Thêm phần tử có dữ liệu payload vào list ở vị trí index.
     * Nếu list hết chỗ, cấp phát thêm gấp đôi chỗ cho list.
     *
     * @param payload
     * @param index
     */
    @Override
    public void insert(Object payload, int index) {
        /* TODO */
        checkBoundaries(index, size);
        if (size == data.length){
            enlarge();
        }
        if (index == size){
            append(payload);
        }
        else {
            for (int i = size; i > index; i--){
                data[i] = data[i - 1];
            }
            data[index] = payload;
        }
        size++;
    }

    /**
     * Tạo iterator để có thể duyệt qua các phần tử của list.
     *
     * @return
     */
    @Override
    public MyIterator iterator() {
        /* TODO */
        return new MyArrayListIterator();
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        Object[] array = new Object[2 * this.data.length];
        System.arraycopy(this.data, 0, array, 0, this.data.length);
        this.data = array;
    }

    /*
     * Inner class implements the Iterator pattern
     */
    private class MyArrayListIterator implements MyIterator {
        /*
         * MyArrayListIterator cần phải biết vị trí hiện tại khi nó đang duyệt qua dữ liệu của MyArrayList.
         */
        private int currentPosition;

        /**
         * Khởi tạo dữ liệu cho Iterator bằng dữ liệu của MyArrayList để nó có thể duyệt qua các phần tử dữ liệu
         * của MyArrayList.
         */
        public MyArrayListIterator() {
            /* TODO */
            this.currentPosition = 0;
        }

        /**
         * Kiểm tra trong MyArrayList có còn phần tử tiếp theo không.
         * Nếu còn thì trả về true, nếu không còn thì trả về false.
         *
         * @return
         */
        @Override
        public boolean hasNext() {
            /* TODO */
            return this.currentPosition < size();
        }

        /**
         * iterator dịch chuyển sang phần tử kế tiếp của MyArrayList và trả ra phần tử hiện tại của MyArrayList.
         *
         * @return phần tử hiện tại.
         */
        @Override
        public Object next() {
            /* TODO */
            if (hasNext()){
                Object temp = data[currentPosition];
                currentPosition++;
                return temp;
            }
            return null;
        }

        /**
         * iterator xóa phần tử hiện tại của MyArrayList
         */
        @Override
        public void remove() {
            /* TODO */
            if (hasNext()){
                MyArrayList.this.remove(currentPosition);
                currentPosition--;
            }
            return;
        }
    }
}
