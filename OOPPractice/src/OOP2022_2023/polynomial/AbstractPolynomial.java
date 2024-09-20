package OOP2022_2023.polynomial;

import java.util.Arrays;

public abstract class AbstractPolynomial implements Polynomial {
    /**
     * Mô tả đa thức theo định dạng [a0 + a1x + a2x^2 + ... + anx^n]
     * @return String mô tả về đa thức.
     */
    @Override
    public String toString() {
        /* TODO */
        double[] currentCoeff = coefficients();
        StringBuilder res = new StringBuilder("[");
        res.append(currentCoeff[0]);
        for (int i = 1; i < currentCoeff.length; i++){
            if (currentCoeff[i] != 0){
                if (currentCoeff[i] > 0){
                    if (i == 1){
                        res.append(" + " + currentCoeff[i] + "x");
                    }
                    else {
                        res.append(" + " + currentCoeff[i] + "x^" + i);
                    }
                }
                else {
                    res.append(" - " + (- currentCoeff[i]) + "x^" + i);
                }
            }
        }
        return res.toString();
    }

    /**
     * Lấy đạo hàm đa thức.
     * @return mảng các phần tử là hệ số của đa thức đạo hàm.
     */
    public double[] differentiate() {
        /* TODO */
        double[] differentiate = new double[coefficients().length - 1];
        for (int i = 0; i < differentiate.length; i++){
            differentiate[i] = coefficients()[i + 1] * i;
        }
        return differentiate;
    }

}
