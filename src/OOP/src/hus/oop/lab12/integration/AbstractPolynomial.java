package hus.oop.lab12.integration;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(coefficients()[0]);
        for (int i = 1; i < coefficients().length; i++) {
            if (coefficients()[i] != 0) {
                if (i == 1) {
                    if (coefficients()[i] > 0) {
                        stringBuilder.append(" + " + coefficients()[i] + "x");
                    } else {
                        stringBuilder.append(" - " + (- coefficients()[i]) + "x");
                    }
                } else {
                    if (coefficients()[i] > 0) {
                        stringBuilder.append(" + " + coefficients()[i] + "x^" + i);
                    } else {
                        stringBuilder.append(" - " + (- coefficients()[i]) + "x^" + i);
                    }
                }
            }
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] derive = new double[coefficients().length - 1];
        for (int i = 0; i < derive.length; i++){
            derive[i] = coefficients()[i + 1] * (i + 1);
        }
        return derive;
    }
}
