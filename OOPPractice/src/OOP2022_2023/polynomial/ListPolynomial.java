package OOP2022_2023.polynomial;

import java.util.ArrayList;
import java.util.Arrays;
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
        double[] coef = new double[coefficients.size()];
        for (int i = 0; i < coefficients.size(); i++){
            coef[i] = coefficients.get(i);
        }
        return coef;
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
        for (int i = coefficients.size() - 1; i >= 0; i--){
            if (coefficients.get(i) != 0){
                return i;
            }
        }
        return Integer.MIN_VALUE;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        /* TODO */
        double res = 0;
        for (int i = 0; i < coefficients.size(); i++){
            res = res * x + coefficients.get(i);
        }
        return res;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        /* TODO */
        double[] differentiate = new double[coefficients.size() - 1];
        for (int i = 0; i < differentiate.length; i++){
            differentiate[i] = this.coefficients.get(i + 1) * i;
        }
        List<Double> newCoef = new ArrayList<>();
        for (int i = 0; i < differentiate.length; i++){
            newCoef.add(differentiate[i]);
        }
        this.coefficients = newCoef;
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
        for (int i = 0; i < Math.max(this.coefficients.size(), another.coefficients.size()); i++){
            sum.add(0.0);
        }
        for (int  i = 0; i < this.coefficients.size(); i++){
            sum.add(this.coefficients.get(i));
        }
        for (int i = 0; i < another.coefficients.size(); i++){
            sum.set(i, sum.get(i) + another.coefficients.get(i));
        }
        this.coefficients = sum;
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        /* TODO */
        List<Double> sum = new ArrayList<>();
        for (int i = 0; i < Math.max(this.coefficients.size(), another.coefficients.size()); i++){
            sum.add(0.0);
        }
        for (int  i = 0; i < this.coefficients.size(); i++){
            sum.add(this.coefficients.get(i));
        }
        for (int i = 0; i < another.coefficients.size(); i++){
            sum.set(i, sum.get(i) - another.coefficients.get(i));
        }
        this.coefficients = sum;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        /* TODO */
        List<Double> multiply = new ArrayList<>(this.coefficients.size() + another.coefficients.size() - 1);
        for (int i = 0; i < this.coefficients.size() + another.coefficients.size() - 1; i++){
            multiply.add(0.0);
        }
        for (int i = 0; i < this.coefficients.size(); i++){
            for (int j = 0; j < another.coefficients.size(); j++){
                multiply.set(i + j, multiply.get(i + j) + this.coefficients.get(i) * another.coefficients.get(j));
            }
        }
        this.coefficients = multiply;
        return this;
    }
}
