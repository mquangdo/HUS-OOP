package review.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        /* TODO */
        coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        /* TODO */
        double[] result = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++) {
            result[i] = coefficients.get(i);
        }
        return result;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        /* TODO */
        coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        /* TODO */
        coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        /* TODO */
        int deg = -1;
        for (int i = coefficients.size() - 1; i >= 0; i--){
            if (coefficients.get(i) != 0){
                deg = i;
            }
        }
        return deg;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double sum = 0;
        for (int i = this.coefficients.size() - 1; i >= 0; i--) {
            sum = sum * x + this.coefficients.get(i);
        }
        return sum;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        List<Double> derive = new ArrayList<>();
        for (int i = 1; i < coefficients.size(); i++){
            derive.add(i * coefficients.get(i));
        }
        coefficients = derive;
        return this;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        List<Double> sum = new ArrayList<>();
        for (int i = 0; i < coefficients.size(); i++){
            sum.add(coefficients.get(i));
        }
        for (int i = 0; i < another.coefficients.size(); i++){
            sum.set(i, sum.get(i) + another.coefficients.get(i));
        }
        coefficients = sum;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        List<Double> minus = new ArrayList<>();
        for (int i = 0; i < coefficients.size(); i++){
            minus.add(coefficients.get(i));
        }
        for (int i = 0; i < another.coefficients.size(); i++){
            minus.set(i, minus.get(i) - another.coefficients.get(i));
        }
        coefficients = minus;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        List<Double> result = new ArrayList<>();
        for (int i = 0; i < coefficients.size() + another.coefficients.size() - 1; i++) {
            result.add(0.0);
        }
        for (int i = 0; i < coefficients.size(); i++) {
            for (int j = 0; j < another.coefficients.size(); j++) {
                result.set(i + j, result.get(i + j) + coefficients.get(i) * another.coefficients.get(j));
            }
        }
        coefficients = result;
        return this;
    }
}
