package OOP2023_2024.datastructure;

public class ArrayMyList extends AbstractMyList {
    private static final int DEFAULT_CAPACITY = 16;
    private int[] data;
    private int size;

    /**
     * Hàm dựng để khởi tạo dữ liệu.
     */
    public ArrayMyList() {
        /* TODO */
        data = new int[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy kích thước của tập dữ liệu.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy giá trị của phần tử ở vị trí index.
     * @param index
     * @return
     */
    @Override
    public int get(int index) {
        /* TODO */
        return data[index];
    }

    /**
     * Sửa dữ liệu ở vị trí index thành data.
     * @param data
     * @param index
     */
    @Override
    public void set(int data, int index) {
        /* TODO */
        if (checkBoundaries(index, size - 1)){
            this.data[index] = data;
        }
    }

    /**
     * Thêm phần tử dữ liệu vào đầu mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value là giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtStart(int value) {
        /* TODO */
        if (size >= this.data.length){
            allocateMore();
        }
        for (int i = 0; i < size; i++){
            data[i + 1] = data[i];
        }
        data[0] = value;
        size++;
    }

    /**
     * Thêm phần tử dữ liệu vào cuối mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value là giá trị của phần tử dữ liệu được thêm vào.
     */
    @Override
    public void insertAtEnd(int value) {
        /* TODO */
        if (size >= this.data.length){
            allocateMore();
        }
        data[size] = value;
        size++;

    }

    /**
     * Thêm phần tử dữ liệu vào vị trí index của mảng dữ liệu.
     * Nếu mảng không còn chỗ, mở rộng mảng để có thể chứa thêm dữ liệu.
     * @param value
     * @param index
     */
    @Override
    public void insertAtPos(int value, int index) {
        /* TODO */
        if (checkBoundaries(index, size)){
            if (size >= data.length){
                allocateMore();
            }
            for (int i = size; i > index; i--){
                data[i] = data[i - 1];
            }
            data[index] = value;
            size++;
        }

    }

    /**
     * Xóa phần tử dữ liệu tại vị trí index.
     * Chỉ xóa được nếu index nằm trong đoạn [0 - (size - 1)]
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (checkBoundaries(index, size - 1)){
            for (int i = index; i < size - 1; i++){
                data[i] = data[i + 1];
            }
            data[size - 1] = 0;
            size--;
        }
    }

    /**
     * Mở rộng gấp đôi kích thước mảng nếu hết chỗ để chứa dữ liệu.
     */
    private void allocateMore() {
        /* TODO */
        int[] temp = new int[2 * this.data.length];
        System.arraycopy(this.data, 0, temp, 0, data.length);
        data = temp;
    }

    /**
     * Lấy ra dữ liệu được lưu theo cấu trúc dữ liệu kiểu mảng.
     * @return
     */
    @Override
    public int[] toArray() {
        /* TODO */
        int[] arr = new int[size()];
        for (int i = 0; i < arr.length; i++){
            arr[i] = data[i];
        }
        return arr;
    }
}
