package lastterm.year2223.de1.integration;

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
        double[] coeff = new double[coefficients.size()];
        for (int i = 0; i < coeff.length; i++){
            coeff[i] = coefficients.get(i);
        }
        return coeff;
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

    public ListPolynomial remove(int index){
        coefficients.remove(index);
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
        int deg = Integer.MIN_VALUE;
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
        double res = 0;
        for (int i = coefficients.size() - 1; i >= 0; i--){
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
        ListPolynomial listPolynomial = new ListPolynomial();
        for (int i = 0; i < differentiate().length; i++){
            listPolynomial.append(differentiate()[i]);
        }
        return listPolynomial;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        /* TODO */
        List<Double> sum = new ArrayList<>();
        int maxLength = Math.max(coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxLength; i++){
            sum.add(0.0);
        }
        for (int i = 0; i < coefficients.size(); i++){
            sum.set(i, sum.get(i) + coefficients.get(i));
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
        int maxLength = Math.max(coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxLength; i++){
            minus.add(0.0);
        }
        for (int i = 0; i < coefficients.size(); i++){
            minus.set(i, minus.get(i) + coefficients.get(i));
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
        List<Double> multi = new ArrayList<>();
        for (int i = 0; i < coefficients.size() + another.coefficients.size() - 1; i++){
            multi.add(0.0);
        }
        for (int i = 0; i < coefficients.size(); i++){
            for (int j = 0; j < another.coefficients.size(); j++){
                multi.set(i + j, multi.get(i + j) + coefficients.get(i) * another.coefficients.get(j));
            }
        }
        coefficients = multi;
        return this;
    }
}
