package midterm.year2324.polynomial;

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
    public double coefficientAt(int index) {
        /* TODO */
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return mảng các hệ số của đa thức
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
     * Thêm một phần tử có hệ số coefficient vào đầu đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtStart(double coefficient) {
        /* TODO */
        coefficients.add(0, coefficient);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public void insertAtEnd(double coefficient) {
        /* TODO */
        coefficients.add(coefficient);
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void insertAtPosition(int index, double coefficient) {
        /* TODO */
        coefficients.add(index, coefficient);
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public void set(int index, double coefficient) {
        /* TODO */
        coefficients.set(index, coefficient);
    }

    public void remove(int index){
        coefficients.remove(index);
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
            listPolynomial.insertAtEnd(differentiate()[i]);
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
        List<Double> sum = new ArrayList<>();
        int maxLength = Math.max(coefficients.size(), another.coefficients.size());
        for (int i = 0; i < maxLength; i++){
            sum.add(0.0);
        }
        for (int i = 0; i < coefficients.size(); i++){
            sum.set(i, sum.get(i) + coefficients.get(i));
        }
        for (int i = 0; i < another.coefficients.size(); i++){
            sum.set(i, sum.get(i) - another.coefficients.get(i));

        }
        coefficients = sum;
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
