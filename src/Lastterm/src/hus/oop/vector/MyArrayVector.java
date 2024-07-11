package hus.oop.vector;

import java.util.Arrays;

public class MyArrayVector extends AbstractMyVector {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] data;
    private int size;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyArrayVector() {
        /* TODO */
        data = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    public MyArrayVector(double[] data){
        this.data = data;
    }

    @Override
    public int size() {
        /* TODO */
        return size;
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        checkIndex(index, size - 1);
        return data[index];
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        return data;
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        checkIndex(index, size - 1);
        data[index] = value;
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector mới.
     */
    public MyArrayVector add(double value) {
        /* TODO */
        double[] res = new double[size()];
        for (int i = 0; i < res.length; i++){
            res[i] = data[i];
        }
        for (int i = 0; i < res.length; i++){
            res[i] += value;
        }
        MyArrayVector vector = new MyArrayVector();
        vector.data = res;
        return vector;
    }

    /**
     * Cộng các phần tử vector hiện tại với các phần tử vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector mới.
     */
    public MyArrayVector add(MyVector another) {
        /* TODO */
        if (this.size != another.size()){
            throw new IllegalArgumentException();
        }
        MyArrayVector vector = new MyArrayVector();
        double[] sum = new double[size];
        for (int i = 0; i < sum.length; i++){
            sum[i] = this.coordinate(i) + another.coordinate(i);
        }
        vector.data = sum;
        return vector;
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++){
            data[i] += value;
        }
        return this;
    }

    /**
     * Cộng các phần tử vector hiện tại với các phần tử vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyArrayVector addTo(MyVector another) {
        /* TODO */
        if (this.size != another.size()){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < size; i++){
            data[i] += another.coordinates()[i];
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * @return vector mới.
     */
    public MyArrayVector minus(double value) {
        /* TODO */
        double[] res = Arrays.copyOf(data, size);
        for (int i = 0; i < res.length; i++){
            res[i] -= value;
        }
        MyArrayVector vector = new MyArrayVector();
        vector.data = res;
        return vector;
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector mới.
     */
    public MyArrayVector minus(MyVector another) {
        /* TODO */
        if (this.size != another.size()){
            throw new IllegalArgumentException();
        }
        MyArrayVector vector = new MyArrayVector();
        double[] sum = new double[size];
        for (int i = 0; i < sum.length; i++){
            sum[i] = this.coordinate(i) - another.coordinate(i);
        }
        vector.data = sum;
        return vector;
    }

    /**
     * Trừ các phần tử của vector cho giá trị value.
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(double value) {
        /* TODO */
        for (int i = 0; i < size; i++){
            data[i] -= value;
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector hiện tại cho các phần tử của vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyArrayVector minusFrom(MyVector another) {
        /* TODO */
        if (this.size != another.size()){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < size; i++){
            data[i] -= another.coordinates()[i];
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public double dot(MyVector another) {
        /* TODO */
        if (this.size != another.size()){
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for (int i = 0; i < size; i++){
            sum += data[i] * another.coordinates()[i];
        }
        return sum;
    }

    /**
     * Các phần tử của vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyArrayVector pow(double power) {
        /* TODO */
        for (int i = 0; i < size; i++){
            data[i] = Math.pow(data[i], power);
        }
        return this;
    }

    /**
     * Các phần tử của vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyArrayVector scale(double value) {
        /* TODO */
        for (int i = 0; i < size; i++){
            data[i] = data[i] * value;
        }
        return this;
    }

    /**
     * Lấy chuẩn của vector.
     * @return chuẩn của vector.
     */
    @Override
    public double norm() {
        /* TODO */
        double res = 0;
        for (int i = 0; i < size; i++){
            res += data[i] * data[i];
        }
        return Math.sqrt(res);
    }

    /**
     * Thêm một giá trị value vào tọa độ vector ở vị trí cuối cùng.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value) {
        /* TODO */
        if (size == data.length){
            enlarge();
        }
        data[size] = value;
        size++;
        return this;
    }

    /**
     * Thêm một giá trị vào tọa độ vector ở vị trí index.
     * Nếu vector không còn đủ chỗ, mở rộng thêm kích thước vector.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector insert(double value, int index) {
        /* TODO */
        if (size == data.length){
            enlarge();
        }
        for (int i = size - 1; i >= index; i--){
            data[i + 1] = data[i];
        }
        data[index] = value;
        size++;
        return this;
    }

    /**
     * Xóa giá trị ở tọa độ thứ index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyArrayVector remove(int index) {
        /* TODO */
        checkIndex(index, size - 1);
        for (int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        size--;
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các giá trị tọa độ
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * @param indices
     * @return vector mới có tọa độ được trích xuất từ vector hiện tại.
     */
    public MyArrayVector extract(int[] indices) {
        /* TODO */
        MyArrayVector vector = new MyArrayVector();
        double[] sub = new double[indices.length];
        for (int i = 1; i < indices.length; i++){
            sub[i] = data[indices[i - 1]];
        }
        vector.data = sub;
        return vector;
    }

    /**
     * Mở rộng kích thước vector lên gấp đôi khi cần thiết.
     * @return vector hiện tại.
     */
    private MyArrayVector enlarge() {
        /* TODO */
        double[] temp = new double[2 * data.length];
        for (int i = 0; i < size; i++) {
            temp[i] = data[i];
        }
        data = temp;
        return this;
    }
}
