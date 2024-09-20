package oop.hus.oop.polynomial;

import java.lang.reflect.Array;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 8;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        this.coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficientAt(int index) {
        /* TODO */
        if (index < 0 || index > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        return coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtStart(double coefficient) {
        /* TODO */
        if (size == coefficents.length){
            allocateMore();
        }
        for (int i = size; i > 0; i--){
            coefficents[i] = coefficents[i - 1];
        }
        coefficents[0] = coefficient;
        size++;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtEnd(double coefficient) {
        /* TODO */
        if (size == coefficents.length){
            allocateMore();
        }
        coefficents[size] = coefficient;
        size++;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void insertAtPosition(int index, double coefficient) {
        /* TODO */
        if (index < 0 || index > size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == coefficents.length){
            allocateMore();
        }
        for (int i = size - 1; i > index; i--){
            this.coefficents[i] = this.coefficents[i - 1];
        }
        this.coefficents[index] = coefficient;
        size++;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void set(int index, double coefficient) {
        /* TODO */
        if (index < 0 || index > size - 1){
            throw new ArrayIndexOutOfBoundsException();
        }
        coefficents[index] = coefficient;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        int deg = Integer.MIN_VALUE;
        for (int i = size; i >= 0; i--){
            if (coefficents[i] != 0){
                deg = i;
                break;
            }
        }
        return deg;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double res = 0;
        for (int i = size - 1; i >= 0; i--){
            res = res * x + coefficents[i];
        }
        return res;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        coefficents = differentiate();
        return this;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        int maxSize = Math.max(this.size, another.size);
        double[] sum = new double[maxSize];
        for (int i = 0; i < this.size; i++){
            sum[i] = this.coefficents[i];
        }
        for (int i = 0; i < another.size; i++){
            sum[i] += another.coefficents[i];
        }
        coefficents = sum;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        /* TODO */
        int maxSize = Math.max(this.size, another.size);
        double[] sum = new double[maxSize];
        for (int i = 0; i < this.size; i++){
            sum[i] = this.coefficents[i];
        }
        for (int i = 0; i < another.size; i++){
            sum[i] -= another.coefficents[i];
        }
        coefficents = sum;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
        double[] multiply = new double[this.size + another.size - 1];
        for (int i = 0; i < this.size; i++){
            for (int j = 0; i < another.size; j++){
                multiply[i + j] += this.coefficents[i] * this.coefficents[j];
            }
        }
        coefficents = multiply;
        return this;
    }

    /**
     * Thêm kích thước mảng gấp đôi để lưu đa thức.
     */
    private void allocateMore() {
        /* TODO */
        double[] temp = new double[coefficents.length * 2];
        System.arraycopy(coefficents, 0, temp, 0, coefficents.length);
        coefficents = temp;
    }
}
