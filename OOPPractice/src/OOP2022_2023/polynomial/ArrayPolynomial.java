package OOP2022_2023.polynomial;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        this.coefficents = new double[DEFAULT_CAPACITY];
        this.size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return this.coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        return this.coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (this.size >= this.coefficents.length){
            enlarge();
        }
        this.coefficents[size++] = coefficient;
        return this;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        /* TODO */
        if (size >= this.coefficents.length){
            enlarge();
        }
        for (int i = size - 1; i > index; i--){
            this.coefficents[i] = this.coefficents[i - 1];
        }
        this.coefficents[index] = coefficient;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */

    public ArrayPolynomial set(double coefficient, int index) {
        /* TODO */
        this.coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        for (int i = size - 1; i >= 0; i--){
            if (this.coefficents[i] != 0){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double res = 0;
        for (int i = this.coefficents.length - 1; i >= 0; i--) {
            res = x * res + this.coefficents[i];
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
        double[] differentiate = new double[size - 1];
        for (int i = 0; i < differentiate.length; i++){
            differentiate[i] = this.coefficents[i + 1] * i;
        }
        this.coefficents = differentiate;
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
            for (int j = 0; j < another.size; j++){
                multiply[i + j] += this.coefficents[i] * another.coefficents[j];
            }
        }
        coefficents = multiply;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double[] newArr = new double[2 * this.coefficents.length];
        System.arraycopy(this.coefficents, 0, newArr, 0, this.coefficents.length);
        this.coefficents = newArr;
    }
}
