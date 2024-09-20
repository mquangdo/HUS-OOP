package OOP2022_2023.book;
import java.util.Arrays;

public class MyArrayList extends MyAbstractList {
    private static final int DEFAULT_CAPACITY = 2;
    private Object[] data;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public MyArrayList() {
        /* TODO */
        data = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy kích thước của list.
     * @return
     */
    @Override
    public int size() {
        /* TODO */
        return size;
    }

    /**
     * Lấy phần tử ở vị trí index trong list.
     * @param index
     * @return
     */
    @Override
    public Object get(int index) {
        /* TODO */
        if (index < 0 || index > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        return data[index];
    }

    /**
     * Sửa phần tử ở vị trí index là payload.
     * @param payload
     * @param index
     */
    @Override
    public void set(Object payload, int index) {
        /* TODO */
        if (index < 0 || index > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        data[index] = payload;
    }

    /**
     * Xóa phần tử ở vị trí index trong list.
     * @param index
     */
    @Override
    public void remove(int index) {
        /* TODO */
        if (index < 0 || index > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
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
        data[size++] = payload;
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
        return new MyArrayListIterator(Arrays.copyOf(data, size));
    }

    /**
     * Cấp phát gấp đôi chỗ cho list khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        Object[] temp = new Object[data.length * 2];
        System.arraycopy(data, 0, temp, 0, data.length);
        data = temp;
    }
}
