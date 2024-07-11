package lastterm.year2223.de4.vector;

import java.util.ArrayList;
import java.util.List;

public class ListVector implements IVector {
    private List<Double> data;

    public ListVector() {
        /* TODO */
        data = new ArrayList<>();
    }

    public ListVector(List<Double> data) {
        /* TODO */
        this.data = data;
    }

    @Override
    public void append(double value) {
        /* TODO */
        data.add(value);
    }

    @Override
    public void insert(double value, int index) {
        /* TODO */
        data.add(index, value);
    }

    @Override
    public void remove(int index) {
        data.remove(index);
    }

    @Override
    public int length() {
        /* TODO */
        return data.size();
    }

    @Override
    public double magnitude() {
        /* TODO */
        double sum = 0;
        for (double value : data) {
            sum += value * value;
        }
        return Math.sqrt(sum);

    }

    public double distanceTo(ListVector another) {
        /* TODO */
        if (data.size() != another.data.size()) {
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            double diff = data.get(i) - another.data.get(i);
            sum += diff * diff;
        }
        return Math.sqrt(sum);
    }

    @Override
    public double[] elements() {
        /* TODO */
        double[] elements = new double[data.size()];
        for (int i = 0; i < data.size(); i++) {
            elements[i] = data.get(i);
        }
        return elements;
    }

    public double element(int index) {
        /* TODO */
        return data.get(index);
    }

    public ListVector minus(ListVector another) {
        /* TODO */
        if (data.size() != another.data.size()) {
            throw new IllegalArgumentException();
        }
        List<Double> res = new ArrayList<>(data.size());
        for (int i = 0; i < data.size(); i++) {
            res.add(data.get(i) - another.data.get(i));
        }
        return new ListVector(res);
    }

    public ListVector plus(ListVector another) {
        /* TODO */
        if (data.size() != another.data.size()) {
            throw new IllegalArgumentException();
        }
        List<Double> res = new ArrayList<>(data.size());
        for (int i = 0; i < data.size(); i++) {
            res.add(data.get(i) + another.data.get(i));
        }
        return new ListVector(res);
    }

    public ListVector scale(double factor) {
        /* TODO */
        List<Double> res = new ArrayList<>(data.size());
        for (double value : data) {
            res.add(value * factor);
        }
        return new ListVector(res);
    }

    public double dot(ListVector another) {
        /* TODO */
        if (data.size() != another.data.size()) {
            throw new IllegalArgumentException();
        }
        double sum = 0;
        for (int i = 0; i < data.size(); i++) {
            sum += data.get(i) * another.data.get(i);
        }
        return sum;
    }

    /*
     * Hàm trả ra format của vector dạng: [a1, a2, ..., an].
     */
    @Override
    public String toString() {
        /* TODO */
        if (data == null) {
            throw new IllegalStateException("Data list is not initialized.");
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < data.size(); i++) {
            sb.append(data.get(i));
            if (i < data.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
