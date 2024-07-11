package lastterm.year2223.de1.integration;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        /* TODO */
        coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        /* TODO */
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
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        /* TODO */
        if (size == coefficents.length){
            enlarge();
        }
        coefficents[size] = coefficient;
        size++;
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
        check(index, size);
        if (size == coefficients().length){
            enlarge();
        }
        if (index == size){
            append(coefficient);
        }
        else {
            for (int i = size; i > index; i--){
                coefficents[i] = coefficents[i - 1];
            }
            coefficents[index] = coefficient;
        }
        size++;
        return this;
    }

    public ArrayPolynomial remove(int index){
        check(index, size - 1);
        for (int i = index; i < size - 1; i++){
            coefficents[i] = coefficents[i + 1];
        }
        coefficents[size - 1] = 0;
        size--;
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
        check(index, size - 1);
        coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        /* TODO */
        int deg = Integer.MIN_VALUE;
        for (int i = size - 1; i >= 0; i--){
            if (coefficents[i] != 0){
                deg = i;
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
        ArrayPolynomial polynomial = new ArrayPolynomial();
        for (int i = 0; i < differentiate().length; i++){
            polynomial.append(differentiate()[i]);
        }
        return polynomial;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        /* TODO */
        int maxLength = Math.max(coefficents.length, another.coefficents.length);
        double[] sum = new double[maxLength];
        for (int i = 0; i < coefficents.length; i++){
            sum[i] += coefficents[i];
        }
        for (int i = 0; i < another.coefficents.length; i++){
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
        int maxLength = Math.max(coefficents.length, another.coefficents.length);
        double[] minus = new double[maxLength];
        for (int i = 0; i < coefficents.length; i++){
            minus[i] += coefficents[i];
        }
        for (int i = 0; i < another.coefficents.length; i++){
            minus[i] -= another.coefficents[i];
        }
        coefficents = minus;
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        /* TODO */
        double[] multi = new double[coefficents.length + another.coefficents.length - 1];
        for (int i = 0; i < coefficents.length; i++){
            for (int j = 0; j < another.coefficents.length; j++){
                multi[i + j] += coefficents[i] * another.coefficents[j];
            }
        }
        coefficents = multi;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        /* TODO */
        double[] temp = new double[coefficents.length * 2];
        System.arraycopy(coefficents, 0, temp, 0, coefficents.length);
        coefficents = temp;
    }
}
