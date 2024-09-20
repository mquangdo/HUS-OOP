package oop.hus.oop.polynomial;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO *

         */
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        sb.append(coefficients()[0]);
        for (int i = 1; i < coefficients().length; i++){
            if (coefficients()[i] != 0){
                if (i == 1){
                    if (coefficients()[i] > 0){
                        sb.append(" + " + coefficients()[i] + "x");
                    } else if (coefficients()[i] < 0){
                        sb.append(" - " + (- coefficients()[i]) + "x");
                    }
                } else {
                    if (coefficients()[i] > 0){
                        sb.append(" + " + coefficients()[i] + "x^" + i);
                    } else if (coefficients()[i] < 0){
                        sb.append(" - " + (- coefficients()[i]) + "x^" + i);
                    }
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] differ = new double[coefficients().length - 1];
        for (int i = 1; i < differ.length; i++){
            differ[i - 1] = coefficients()[i] * (i);
        }
        return differ;
    }
}