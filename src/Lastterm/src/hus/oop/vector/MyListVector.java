package hus.oop.vector;

import java.util.ArrayList;
import java.util.List;

public class MyListVector extends AbstractMyVector {
    private List<Double> data;

    /**
     * Khởi tạo mặc định cho vector.
     */
    public MyListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    @Override
    public int size() {
        /* TODO */
        return data.size();
    }

    @Override
    public double coordinate(int index) {
        /* TODO */
        return data.get(index);
    }

    @Override
    public double[] coordinates() {
        /* TODO */
        double[] elements = new double[data.size()];
        for (int i = 0; i < data.size(); i++) {
            elements[i] = data.get(i);
        }
        return elements;
    }

    @Override
    public void set(double value, int index) {
        /* TODO */
        data.set(index, value);
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector mới.
     */
    public MyListVector add(double value) {
        /* TODO */
        List<Double> temp = new ArrayList<>(data);
        MyListVector vector = new MyListVector();
        for (int i = 0; i < size(); i++){
            temp.set(i, data.get(i) + value);
        }
        vector.data = temp;
        return vector;
    }

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector mới.
     */
    public MyListVector add(MyVector another) {
        /* TODO */
        if (size() != another.size()){
            throw new IllegalArgumentException();
        }
        List<Double> temp = new ArrayList<>();
        MyListVector vector = new MyListVector();
        for (int i = 0; i < size(); i++){
            temp.add(coordinate(i) + another.coordinate(i));
        }
        vector.data = temp;
        return this;
    }

    /**
     * Cộng các phần tử của vector với value.
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector addTo(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++){
            data.set(i, data.get(i) + value);
        }
        return this;
    }

    /**
     * Cộng vector hiện tại với một vector khác.
     * Nếu hai vector không cùng số chiều thì không cộng được.
     * In ra thông báo lỗi hoặc ném exception.
     * @param another
     * @return vector hiện tại.
     */
    public MyListVector addTo(MyVector another) {
        /* TODO */
        for (int i = 0; i < size(); i++){
            data.set(i, data.get(i) + another.coordinate(i));
        }
        return this;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * @return vector mới.
     */
    public MyListVector minus(double value) {
        /* TODO */
        List<Double> temp = new ArrayList<>(data);
        MyListVector vector = new MyListVector();
        for (int i = 0; i < size(); i++){
            temp.set(i, data.get(i) - value);
        }
        vector.data = temp;
        return vector;
    }

    /**
     * Trừ vector hiện tại cho vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector mới.
     */
    public MyListVector minus(MyVector another) {
        /* TODO */
        if (size() != another.size()){
            throw new IllegalArgumentException();
        }
        List<Double> temp = new ArrayList<>();
        MyListVector vector = new MyListVector();
        for (int i = 0; i < size(); i++){
            temp.add(coordinate(i) - another.coordinate(i));
        }
        vector.data = temp;
        return this;
    }

    /**
     * Trừ các phần tử của vector cho value.
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++){
            data.set(i, data.get(i) - value);
        }
        return this;
    }

    /**
     * Trừ vector hiện tại cho vector khác.
     * Nếu hai vector không cùng số chiều thì không trừ được.
     * In ra thông báo lỗi hoặc ném exception.
     * @return vector hiện tại.
     */
    public MyListVector minusFrom(MyVector another) {
        /* TODO */
        if (size() != another.size()){
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < size(); i++){
            data.set(i, data.get(i) - another.coordinate(i));
        }
        return this;
    }

    /**
     * Tích vô hướng của hai vector.
     * Hai vector chỉ có tích vô hướng nếu có cùng số chiều.
     * Nếu hai vector không cùng số chiều, in ra thông báo lỗi hoặc ném exception.
     * @return tích vô hướng.
     */
    public double dot(MyVector another) {
        /* TODO */
        if (this.size() != another.size()){
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for (int i = 0; i < size(); i++){
            sum += data.get(i) * another.coordinate(i);
        }
        return sum;
    }

    /**
     * Các phần tử vector được lấy mũ power.
     * @param power
     * @return vector hiện tại.
     */
    public MyListVector pow(double power) {
        /* TODO */
        for (int i = 0; i < size(); i++){
            data.set(i, Math.pow(data.get(i), power));
        }
        return this;
    }

    /**
     * Các phần tử vector được nhân với value.
     * @return vector hiện tại.
     */
    public MyListVector scale(double value) {
        /* TODO */
        for (int i = 0; i < size(); i++){
            data.set(i, data.get(i) * value);
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
        for (int i = 0; i < size(); i++){
            res += data.get(i) * data.get(i);
        }
        return Math.sqrt(res);
    }

    /**
     * Thêm một giá trị value vào vector ở vị trí cuối cùng.
     * @param value
     * @return vector hiện tại.
     */
    public MyListVector insert(double value) {
        /* TODO */
        data.add(value);
        return this;
    }

    /**
     * Thêm một giá trị vào vector ở vị trí index.
     * @param value
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector insert(double value, int index) {
        /* TODO */
        data.add(index, value);
        return this;
    }

    /**
     * Xóa phần tử ở vị trí index.
     * Nếu index không hợp lệ thì in ra thông báo lỗi hoặc ném exception.
     * @param index
     * @return vector hiện tại.
     */
    public MyListVector remove(int index) {
        /* TODO */
        data.remove(index);
        return this;
    }

    /**
     * Trích xuất ra một vector con của vector ban đầu, có các phần tử
     * được lấy theo các chỉ số của mảng đầu vào.
     * Ví dụ, cho vector [1 2 3 4 5], cho mảng đầu vào là {2, 1} thì vector trích xuất ra
     * có tọa độ là [2 1].
     * Nếu có thỉ số trong mảng đầu vào không hợp lệ thì in ra thông báo lỗi,
     * hoặc ném exception.
     * @param indices
     * @return vector mới có kiểu MyListVector có các phần tử được trích xuất từ vector hiện tại.
     */
    public MyListVector extract(int[] indices) {
        /* TODO */
        MyListVector vector = new MyListVector();
        List<Double> temp = new ArrayList<>();
        for (int i = 1; i < indices.length; i++){
            temp.add((double) (indices[i - 1]));
        }
        vector.data = temp;
        return vector;
    }
}
